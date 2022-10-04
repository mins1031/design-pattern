package com.example.designpattern.lecture_baek._05_prototype._02_after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 내용 정리 : jvm");

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone);

        //TODO clone 을 사용할때 이득을 보는 경우는 모제품을 만들떄의 리소스 소모가 큰경우(ex. 타 서버와 통신을 해서 가져온 데이터로 만들어야 하거나, 디비에서 가져온 데이터로 뭔가 만들어야 할 경우 )
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());

        //TODO clone이 기본적으로 제공하는 복사는 얕은 복사임. 그래서 clone 인스턴스는 repository의 변경에 영향을 받게 된다.
        System.out.println(clone.getRepository() == githubIssue.getRepository());
    }
}
