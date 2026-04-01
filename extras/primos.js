const args = process.argv;

actualGold = parseInt(args[2])
frosties = parseInt(args[3])
primos = parseInt(args[4])
currency = parseInt(args[5])

let finalGold = actualGold

const convertFrosties = (frosties) => Math.floor(frosties / 23);
const convertPrimos = (primos, currency) => primos * currency;

primos += convertFrosties(frosties)
console.log("primos = " + primos)
finalGold += convertPrimos(primos, currency)

console.log(finalGold);
