using Microsoft.EntityFrameworkCore;

namespace aula13_OTO{
    public class AppDbContext : DbContext{
        protected override void OnConfiguring(DbContxtOptionsBuilder optionsBuilder)
    }
        protected override void OnModelCreating(ModelBuilder modelBuilder){
            modelBuilder.Entity<Pessoa>()
                .HasOne(p => p.Endereco)
                .WithOne(e => e.Pessoa)
                .HasForeignKey<Endereco>(e => e.PessoaId);
        }

}