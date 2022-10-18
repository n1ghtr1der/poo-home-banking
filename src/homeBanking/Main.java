package homeBanking;

import homeBanking.models.Cliente;
import homeBanking.models.ContaBancaria;
import homeBanking.models.Endereco;
import homeBanking.models.Estado;

public class Main {
    public static void main(String[] args) {
        //Endereco enderecoCliente1 = new Endereco("Rua Suiça", 120, "Fortaleza", Estado.CE, "60711-030");
        //Endereco enderecoCliente2 = new Endereco("Rua Nascimento de Moraes", 520, "São Luís", Estado.MA, "65076-320");

        Cliente cliente1 = new Cliente("Cléber", "123.123.123-12", new Endereco("Rua Suiça", 120, "Fortaleza", Estado.CE, "60711-030"));
        Cliente cliente2 = new Cliente("Renata", "987.987.987-98", new Endereco("Rua Nascimento de Moraes", 520, "São Luís", Estado.MA, "65076-320"));

        ContaBancaria contaBancaria1 = new ContaBancaria(1, cliente1, 1000.00);
        ContaBancaria contaBancaria2 = new ContaBancaria(2, cliente2);

        System.out.println(contaBancaria1);
        System.out.println(contaBancaria2);

        contaBancaria1.deposito(80.0);
        System.out.println(contaBancaria1);
        contaBancaria2.deposito(850.0);
        System.out.println(contaBancaria2);

        contaBancaria1.saque(50.0);
        System.out.println(contaBancaria1);
        contaBancaria2.saque(100.0);
        System.out.println(contaBancaria2);
    }
}
