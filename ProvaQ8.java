
package provaq8;

/**
 *
 * @author yasmi
 */
public class ProvaQ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
       
        double ValorPdt, ValorPdtFinal, Desconto;
        int CodigoPdt;


        ValorPdt = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto: R$"));

        CodigoPdt = Integer.parseInt(JOptionPane.showInputDialog("insira o codigo do pagamento, por favor: "
                + "\n(1 À vista em dinheiro ou cheque)\n(2 À vista no cartão de crédito)"
                + "\n(3 Em duas vezes)\n(4 Em três vezes)"));

        if(CodigoPdt == 1){

            ValorPdtFinal = ValorPdt - 0.15;

            JOptionPane.showMessageDialog(null, "O Código inserido foi 1\n então você receberá 15% de deconto\n "
                    + "e o Valor Final do produto a ser pago será de: R$"+ValorPdtFinal);

        }else if(CodigoPdt == 2){

            ValorPdtFinal = ValorPdt - 0.1;

            JOptionPane.showMessageDialog(null, "O Código inserido foi 2\n então você receberá 10% de deconto\n"
                    + "e o ValorPdtFinal = ValorPdt;

            JOptionPane.showMessageDialog(null, "O Código inserido foi 3\n"
                    + "Então você não receberá Juros \ne o Valor Final do produto a ser pago será de: R$"+ValorPdtFinal);
        }else if(CodigoPdt == 4){


            ValorPdtFinal = ValorPdt + 0.1;

            JOptionPane.showMessageDialog(null, "O Código inserido foi 4\n então você tera um Juros de 10% "
                    + "Pelo Produto\ne o Valor Final do produto a ser pago será de: R$"+ValorPdtFinal);


        } else{

            JOptionPane.showMessageDialog(null, "Código inserido invalido\n insira o código correto\n"
                    + " tchauzinho xiru");

        }


    }

