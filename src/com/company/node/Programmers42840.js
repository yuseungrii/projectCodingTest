function solution(answers) {
    let answer = [];
    let max =0;
    let point = [0,0,0]; //점수를 계산하기 위한 point 배열 생성
    let list = [
        [1,2,3,4,5],
        [2,1,2,3,2,4,2,5],
        [3,3,1,1,2,2,4,4,5,5]
    ]

    // 정답배열을 돌면서 각자 맞춘 갯수 저장.
    for(let i=0; i<answers.length; i++){
        if(answers[i] === list[0][i%5])
            point[0]++;
        if(answers[i] === list[1][i%8])
            point[1]++;
        if(answers[i] === list[2][i%10])
            point[2]++;
    }

    //가장 많이 맞춘 개수 max 저장.
    for(let j=0; j<point.length; j++){
        if(point[j] > max)
            max = point[j];
    }
    //처음부터 순서대로 돌면서 point가 max와 같으면 answer에 push.
    for(let k=0; k<point.length; k++){
        if(max===point[k])
            answer.push(k+1);
    }
    return answer;
}


console.log(solution([1, 2, 3, 4, 5]));
console.log(solution([1, 3, 2, 4, 2]));