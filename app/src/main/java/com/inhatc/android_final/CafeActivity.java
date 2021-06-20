package com.inhatc.android_final;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.*;
import com.naver.maps.map.overlay.LocationOverlay;
import com.naver.maps.map.overlay.Marker;

public class CafeActivity extends AppCompatActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_cafe);

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

        marker1.setPosition(new LatLng(37.45177576247311, 126.65496949340935));
        marker1.setCaptionText("스타벅스 인하대점");
        marker1.setMap(naverMap);

        marker2.setPosition(new LatLng(37.45190556764987, 126.65450329399613));
        marker2.setCaptionText("이디야커피 인하대점");
        marker2.setMap(naverMap);

        marker3.setPosition(new LatLng(37.45113139099564, 126.65730484119031));
        marker3.setCaptionText("탐앤탐스 인하대점");
        marker3.setMap(naverMap);

        marker4.setPosition(new LatLng(37.45133859699409, 126.65668434722097));
        marker4.setCaptionText("투썸플레이스 인하대점");
        marker4.setMap(naverMap);

        marker5.setPosition(new LatLng(37.45168836767112, 126.65536748832541));
        marker5.setCaptionText("공차 인하대점");
        marker5.setMap(naverMap);

        marker5.setPosition(new LatLng(37.45129713306827, 126.65715006407153));
        marker5.setCaptionText("매머드커피 인하대점");
        marker5.setMap(naverMap);

        marker6.setPosition(new LatLng(37.45256597317287, 126.6575540170433));
        marker6.setCaptionText("빽다방 인하대점");
        marker6.setMap(naverMap);

        marker7.setPosition(new LatLng(37.45026630578328, 126.65382353738579));
        marker7.setCaptionText("그라찌에 인하대점");
        marker7.setMap(naverMap);

        marker8.setPosition(new LatLng(37.45250083158073, 126.65546801035775));
        marker8.setCaptionText("롬버스 커피");
        marker8.setMap(naverMap);

        marker9.setPosition(new LatLng(37.4509982416368, 126.65790700507401));
        marker9.setCaptionText("아마스빈 인하대점");
        marker9.setMap(naverMap);

        marker10.setPosition(new LatLng(37.45135147065307, 126.65702416652219));
        marker10.setCaptionText("커피만 인하대점");
        marker10.setMap(naverMap);
    }
}
