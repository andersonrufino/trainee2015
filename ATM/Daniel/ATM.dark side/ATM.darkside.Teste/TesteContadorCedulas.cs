using ATM.darkside;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace ATM.darkside.Teste
{
    [TestClass]
    public class TesteContadorCedulas
    {
        [TestMethod]
        public void recebe_100_saca_1_nota_de_100()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(100);
            Assert.AreEqual(1, totalCedulas[100]);
        }

        [TestMethod]
        public void recebe_50_saca_1_nota_de_50()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(50);
            Assert.AreEqual(1, totalCedulas[50]);
        }
        
        [TestMethod]
        public void recebe_150_saca_1_nota_de_50_e_1_de_100()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(150);
            Assert.AreEqual(1, totalCedulas[50]);
            Assert.AreEqual(1, totalCedulas[100]);

        }
        [TestMethod]
        public void recebe_110_saca_1_nota_de_10_e_1_de_100()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(110);
            Assert.AreEqual(1, totalCedulas[10]);
            Assert.AreEqual(1, totalCedulas[100]);
        }

        [TestMethod]
        public void recebe_130_saca_1_nota_de_10_100_20()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(130);
            Assert.AreEqual(1, totalCedulas[10]);
            Assert.AreEqual(1, totalCedulas[20]);
            Assert.AreEqual(1, totalCedulas[100]);
        }

        [TestMethod]
        public void recebe_7990_saca_79_100__1_50__2_20()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(7990);
            Assert.AreEqual(79, totalCedulas[100]);
            Assert.AreEqual(1, totalCedulas[50]);
            Assert.AreEqual(2, totalCedulas[20]);

        }

        [TestMethod]
        [ExpectedException(typeof(System.Exception))]
        public void recebe_87_excecao()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(87);
           
        }

        [TestMethod]
        [ExpectedException(typeof(System.Exception))]
        public void recebe_1532_excecao()
        {
            var contador = new ContadorCedulas();
            var totalCedulas = contador.numCedulas(87);
            
        }
    }
}
