## Calculadora de Juros

Aplicação em Java via linha de comando para calcular o acúmulo de juros diários (2,5% ao dia) sobre um valor em atraso, com base na data de vencimento inserida.

---

### Tecnologias Utilizadas

* **Java 17**
* **`java.time` (LocalDate, ChronoUnit)** para manipulação de datas e cálculo de dias em atraso.
* **`java.math.BigDecimal`** para precisão nos cálculos financeiros e arredondamento monetário.
* **`java.util.Scanner`** para receber os valores.

---

## Como funciona

1. **Leitura de entrada:** Recebe o valor original da dívida e a data de vencimento no formato brasileiro (`dd/MM/yyyy`).
2. **Cálculo de dias em atraso:** Utiliza a data atual do sistema para determinar a diferença exata de dias em relação ao vencimento.
3. **Cálculo de Juros:** Aplica a taxa de **2,5% ao dia** (`0.025`) sobre o valor principal para cada dia de atraso.

---

## Como Executar a Aplicação

### Pré-requisitos
* **JDK 17** ou superior instalado e configurado no ambiente.

### Passo a Passo

1. **Clone o repositório:**
```bash
git clone https://github.com/lopes-thais/Calculadora-Juros.git
```

Navegue até a pasta do projeto:

```bash
cd Calculadora-Juros
```

```bash
cd src
```

Compile a classe Java:

```bash
javac CalculoJuros.java
```

Execute o programa:

```bash
java CalculoJuros
```

### Exemplo de Uso (Terminal)

```bash
----- PROGRAMA PARA CÁLCULO DE JUROS ACUMULADO ENTRE DATAS -----
Insira o valor (ex: 999,99): 
1200,90
Insira a data de vencimento (dd/MM/yyyy): 
10/09/2026

Data inserida: 10/09/2026
Valor inserido: R$ 1200.90
Total de dias entre hoje e o vencimento: 11
JUROS TOTAL: R$ 330.25
TOTAL A PAGAR COM JUROS: R$ 1531.15
```
