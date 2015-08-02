using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ATM.Models.Tests
{
    [TestClass]
    public class Sacar_Da_ATM_Test
    {
        [TestMethod]
        public void Sacar_10_Retorna_Uma_Nota_De_10()
        {
            var atm = new ATM();
            var resultado = atm.sacar(10);
            Assert.AreEqual(1, resultado.Quantidade_Da_Nota(10));
        }

        [TestMethod]
        public void Sacar_100_Retorna_Uma_Nota_De_100()
        {
            var atm = new ATM();
            var resultado = atm.sacar(100);
            Assert.AreEqual(1, resultado.Quantidade_Da_Nota(100));
        }

        [TestMethod]
        public void Sacar_50_Retorna_Uma_Nota_De_50()
        {
            var atm = new ATM();
            var resultado = atm.sacar(50);
            Assert.AreEqual(1, resultado.Quantidade_Da_Nota(50));
        }

        [TestMethod]
        public void Sacar_320_Retorna_3_Notas_De_100_Eh_1_Nota_De_20()
        {
            var atm = new ATM();
            var resultado = atm.sacar(320);
            Assert.AreEqual(3, resultado.Quantidade_Da_Nota(100));
            Assert.AreEqual(1, resultado.Quantidade_Da_Nota(20));
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Sacar_80_Negativo_Retorna_Uma_Exception()
        {
            var atm = new ATM();
            var resultado = atm.sacar(-80);
            
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Sacar_35_Retorna_Uma_Exception()
        {
            var atm = new ATM();
            var resultado = atm.sacar(35);

        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Sacar_8_Retorna_Uma_Exception()
        {
            var atm = new ATM();
            var resultado = atm.sacar(35);

        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Sacar_41_Retorna_Uma_Exception()
        {
            var atm = new ATM();
            var resultado = atm.sacar(41);

        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
        public void Sacar_44_Retorna_Uma_Exception()
        {
            var atm = new ATM();
            var resultado = atm.sacar(44);

        }
    }
}
