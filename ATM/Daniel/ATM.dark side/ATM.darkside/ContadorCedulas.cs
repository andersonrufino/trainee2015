using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ATM.darkside
{
    public class ContadorCedulas
    {
        IDictionary <int,int> cedulas;
        public ContadorCedulas()
        {
            cedulas = new Dictionary<int,int>();
            cedulas.Add(100, 0);
            cedulas.Add(50, 0);
            cedulas.Add(20, 0);
            cedulas.Add(10, 0);
        }

        public IDictionary<int,int> numCedulas(int valor)
        {
            int cem;
            int cinquenta;
            int vinte;
            int dez;
            int aux;

            cem = valor / 100;
            aux = valor % 100;

            cinquenta = aux / 50;
            aux = aux % 50;

            vinte = aux / 20;
            aux = aux % 20;

            dez = aux / 10;
            aux = aux % 10;

            if (aux != 0)
            {
                throw new Exception("Valor inválido");
            }

            cedulas.Remove(100);
            cedulas.Add(100, cem);

            cedulas.Remove(50);
            cedulas.Add(50, cinquenta);

            cedulas.Remove(20);
            cedulas.Add(20, vinte);

            cedulas.Remove(10);
            cedulas.Add(10, dez);        

            return cedulas;
        }
    }
}
