const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const gugudan = (number) => {
    for(let i=1; i<=9; i++){
        console.log(number, '*', i, '=', number*i);
    }
}

rl.on("line", function(line) {
    const input = parseInt(line);
    gugudan(input);

    rl.close();
}).on("close", function() {
    process.exit();
});