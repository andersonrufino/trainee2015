using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ATM.Models
{
    public class ATM
    {
        private int[] notas;
        private IDictionary<int, int> notasQuantidade;

        public ATM()
        {
            notas = new int[] {100, 50, 20, 10};
            notasQuantidade = new Dictionary<int, int>();
            notasQuantidade.Add(100, 0);
            notasQuantidade.Add(50, 0);
            notasQuantidade.Add(20, 0);
            notasQuantidade.Add(10, 0);
        }

        public NotasATM sacar(int valor)
        {
            if (valor < 10)
                throw new ArgumentException("Valor Passado é menor qu o minimo!!");

            for (int i = 0; i < notas.Length;)
            {
                if (valor >= notas[i])
                {
                    valor -= notas[i];
                    this.Aumentar_Quantidade_Da_Nota(notas[i]);
                }
                else
                    i++;
            }

            if(valor > 0)
                throw new ArgumentException("Valor Passado é invalido!!");
            return new NotasATM(notasQuantidade);
        }

        private void Aumentar_Quantidade_Da_Nota(int nota)
        {
            if (notasQuantidade.ContainsKey(nota))
                notasQuantidade[nota] += 1;
        }

        
    }

    
}
