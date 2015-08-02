using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ATM.Models
{
    public class NotasATM
    {
        private IDictionary<int, int> notasQuantidade;
        public NotasATM(IDictionary<int, int>  notasQuantidade)
        {
            this.notasQuantidade = notasQuantidade;
        }

        public int Quantidade_Da_Nota(int nota)
        {
            int resultado = 0;
            notasQuantidade.TryGetValue(nota, out resultado);
            return resultado;
        }

        
    }
}
