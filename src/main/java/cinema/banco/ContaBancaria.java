package banco;


    public class ContaBancaria {

        private double saldo;
        private double chequeEspecial;
        private double chequeEspecialUsado;

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public double getChequeEspecial() {
            return chequeEspecial;
        }

        public void setChequeEspecial(double chequeEspecial) {
            this.chequeEspecial = chequeEspecial;
        }

        public double getChequeEspecialUsado() {
            return chequeEspecialUsado;
        }

        public void setChequeEspecialUsado(double chequeEspecialUsado) {
            this.chequeEspecialUsado = chequeEspecialUsado;
        }

        public ContaBancaria(double depositoInicial) {
            this.saldo = depositoInicial;
            if (depositoInicial <= 500.00) {
                this.chequeEspecial = 50.00;
            } else {
                this.chequeEspecial = depositoInicial * 0.5;
            }
        }

        public void depositar(double valor) {
            if (this.chequeEspecialUsado > 0) {
                double taxa = this.chequeEspecialUsado * 0.20;
                valor -= taxa;
                System.out.printf("taxa de 20%% sobre o cheque especial cobrada: R$ %.2f\n", taxa);

                if (valor >= chequeEspecialUsado) {
                    this.saldo += (valor - chequeEspecialUsado);
                    this.chequeEspecialUsado = 0.0;
                } else {
                    this.chequeEspecialUsado -= valor;
                }
            } else{
                this.saldo += valor;
            }
        }

        public void sacar(double valor) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
            } else if (valor <= (this.saldo + this.chequeEspecial)) {
                double quantoFaltou = valor - this.saldo;
                this.saldo = 0.0;
                this.chequeEspecialUsado += quantoFaltou;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        public void pagarBoleto(double valor) {
            sacar(valor);
        }

        public boolean isUsandoChequeEspecial() {
            return this.chequeEspecialUsado > 0;
        }

        public void consultarSaldo() {
            System.out.println("===SALDO ATUAL===");
            System.out.printf("Saldo em conta: R$ %.2f\n", this.saldo);
        }

        public void consultarChequeEspecial() {
            System.out.println("===CHEQUE_ESPECIAL===");
            System.out.printf("Limite de Cheque Especial: R$ %.2f\n", this.chequeEspecial);
            System.out.printf("Valor do Cheque Utilizado: R$ %.2f\n", this.chequeEspecialUsado);
            double disponivelTotal = this.saldo + (this.chequeEspecial - this.chequeEspecialUsado);
            System.out.printf("Total disponivel para saque: R$ %.2fn", disponivelTotal);
        }
    }

