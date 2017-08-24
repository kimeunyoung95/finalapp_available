package com.example.win10_pc.project.network;

/**
 * Created by win10_pc on 2017-06-13.
 */


import com.example.win10_pc.project.dto.Duplication;
import com.example.win10_pc.project.dto.SignRequest;
import com.example.win10_pc.project.dto.SignResponse;

import java.lang.reflect.Member;

import lombok.NonNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;



public interface HttpService {

    /*
     * 로그인 요청
     * @param email
     * @param password
     * @return todo 현재 미완성 뭘 줘야할지;;
     */
    @POST("sign/in")
    Call<SignResponse> signIn(@NonNull @Body SignRequest signRequest);

    /**
     * 이메일 중복 체크
     * @param email
     * @return true : 이메일 사용 가능, false : 이메일 사용 불가능
     *
     */
    @GET("sign/duplication")
    Call<Duplication> duplication(@NonNull @Query("email") String email);


    /**
     * 회원가입
     * @param member
     * @return 회원가입 완료된 유저 정보를 리턴
     */
    @POST("sign/up")
    Call<Member> signUp(@NonNull @Body Member member);



    /**
     * 유저 정보 요청
     * @param id
     * @return 해당하는 id의 유저 정보
     */
    @GET("users/{id}")
    Call<Member> getUser(@Path("id") Long id);


    /**
     * 유저의 타입 정보 업데이트
     * 타입은 1~5까지이고 각각의 type은들 1.0 이상 10.0 이하의 값을 가지는 Double
     * @param id
     * @param type1
     * @param type2
     * @param type3
     * @param type4
     * @param type5
     * @return
     */
    @POST("users/{id}/types")
    Call<Void> updateUserType(@Path("id") Long id,
                              @NonNull @Body Double type1,
                              @NonNull @Body Double type2,
                              @NonNull @Body Double type3,
                              @NonNull @Body Double type4,
                              @NonNull @Body Double type5);




}
