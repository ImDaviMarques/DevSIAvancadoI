using Microsoft.EntityFrameworkCore;

namespace aula13_OTO{
    class Program{
        static void Main(string[] args){
            using(var context = new AppDbContext()){
                context.DataBase.EnsureDeleted();
                context.DataBase.EnsureCreated();

                // Adicionando Pessoa com Endereco "Relacionamento 1:1"
                var pessoa = new Pessoa { Nome = "Joao"};
                var endereco = new Endereco {Rua = "Rua A", pessoa = pessoa};

                context.Pessoas.Add(pessoa);
                context.Enderecos.Add(endereco);
                context.SaveChanges();

                var pessoaComEndereco = context.Pessoas.Include(pessoa => p.Endereco).FirstOrDefault
                Console.WriteLine($"nOME")
            }
        }
    }
}