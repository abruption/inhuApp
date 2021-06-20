package com.inhatc.android_final;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

public class ChinaActivity extends AppCompatActivity implements OnMapReadyCallback {

    NaverMap naverMap;

    private Marker marker1 = new Marker();
    private Marker marker2 = new Marker();
    private Marker marker3 = new Marker();
    private Marker marker4 = new Marker();
    private Marker marker5 = new Marker();
    private Marker marker6 = new Marker();
    private Marker marker7 = new Marker();
    private Marker marker8 = new Marker();
    private Marker marker9 = new Marker();
    private Marker marker10 = new Marker();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        if (mapFragment == null) {
            mapFragment = MapFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.map_fragment, mapFragment).commit();
        }
        mapFragment.getMapAsync( this);
    }

    @UiThread
    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {
        CameraPosition cameraPosition = new CameraPosition(new LatLng(37.44922743643702, 126.65566999467325), 15);
        naverMap.setCameraPosition(cameraPosition);

        marker1.setPosition(new LatLng(37.45151945228519, 126.6567876628352));
        marker1.setCaptionText("취엔");
        marker1.setMap(naverMap);

        marker2.setPosition(new LatLng(37.45262456135129, 126.65749308376797));
        marker2.setCaptionText("짜장전설 인하대점");
        marker2.setMap(naverMap);

        marker3.setPosition(new LatLng(37.451127656326584, 126.65758964327804));
        marker3.setCaptionText("짜장나라 인하대점");
        marker3.setMap(naverMap);

        marker4.setPosition(new LatLng(37.45104248302057, 126.65771034267581));
        marker4.setCaptionText("인하반점");
        marker4.setMap(naverMap);

        marker5.setPosition(new LatLng(37.450970085634175, 126.65801075006577));
        marker5.setCaptionText("인하각");
        marker5.setMap(naverMap);

        marker5.setPosition(new LatLng(37.451270321396905, 126.6578551819531));
        marker5.setCaptionText("마라이궈 인하대점");
        marker5.setMap(naverMap);

        marker6.setPosition(new LatLng(37.450956705995615, 126.65819974106851));
        marker6.setCaptionText("인하성");
        marker6.setMap(naverMap);

        marker7.setPosition(new LatLng(37.451414511900175, 126.65782423183103));
        marker7.setCaptionText("라화쿵푸 인하대점");
        marker7.setMap(naverMap);

        marker8.setPosition(new LatLng(37.45155289397908, 126.66025735885968));
        marker8.setCaptionText("복가주점 인하대점");
        marker8.setMap(naverMap);

        marker9.setPosition(new LatLng(37.451953323270025, 126.65436665885969));
        marker9.setCaptionText("적성루");
        marker9.setMap(naverMap);

        marker10.setPosition(new LatLng(37.445282417260415, 126.65881419444199));
        marker10.setCaptionText("보화장");
        marker10.setMap(naverMap);
    }
}
