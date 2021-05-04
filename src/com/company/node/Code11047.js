const readline = require('readline');
const rl = readline.createInterface(process.stdin, process.stdout);
let input = [];
rl.on('line', line => input.push(line)).on('close',() => {
    const firstLine = input.shift().split(' ');
    const n = parseInt(firstLine[0]); //동전 종류
    let k = parseInt(firstLine[1]); //동전 가치의 합
    let answer = 0;
    let now;

    console.log(firstLine, 'firstLine');

    for(let i=n-1;i>=0;i--){
        now = parseInt(input[i]);
        if(k/now >= 1){
            answer += Math.floor(k/now);
            k = k%now;
        }
        if(k===0) break;
    }
    console.log(answer);
});
