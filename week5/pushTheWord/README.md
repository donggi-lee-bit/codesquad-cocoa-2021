# 2021 마스터즈 코스 테스트

## 1단계: 단어 밀어내기 구현하기
- 입력: 사용자로부터 단어 하나, 정수 숫자 하나( -100 <= N < 100) , L 또는 R을 입력받는다. L 또는 R은 대소문자 모두 입력 가능하다.
- 주어진 단어를 L이면 주어진 숫자 갯수만큼 왼쪽으로, R이면 오른쪽으로 밀어낸다.
- 밀려나간 단어는 반대쪽으로 채워진다.
### 입력 및 출력 예시
홀수 줄은 입력, 짝수 줄은 출력이다.
```
> apple 3 L
leapp

> banana 6 R
banana

> carrot -1 r
arrotc

> cat -4 R
atc
```

1단계 코딩 요구사항
컴파일 및 실행되지 않을 경우 불합격
자기만의 기준으로 최대한 간결하게 코드를 작성한다.