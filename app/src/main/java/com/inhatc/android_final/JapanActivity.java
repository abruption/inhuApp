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

public class JapanActivity extends AppCompatActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_japan);

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

        marker1.setPosition(new LatLng(37.45182481642742, 126.65581923532672));
        marker1.setCaptionText("이치라멘");
        marker1.setMap(naverMap);

        marker2.setPosition(new LatLng(37.45167762262368, 126.6563141592525));
        marker2.setCaptionText("고양이눈");
        marker2.setMap(naverMap);

        marker3.setPosition(new LatLng(37.451797000297745, 126.65636963745065));
        marker3.setCaptionText("오하요");
        marker3.setMap(naverMap);

        marker4.setPosition(new LatLng(37.45206588911812, 126.65606158745558));
        marker4.setCaptionText("덴세츠라멘 인하대본점");
        marker4.setMap(naverMap);

        marker5.setPosition(new LatLng(37.45216324517681, 126.65612582536924));
        marker5.setCaptionText("탄포포");
        marker5.setMap(naverMap);

        marker5.setPosition(new LatLng(37.451687779351964, 126.65767549700695));
        marker5.setCaptionText("오겡끼데스까");
        marker5.setMap(naverMap);

        marker6.setPosition(new LatLng(37.452313934255244, 126.65738713891228));
        marker6.setCaptionText("덴세츠스시");
        marker6.setMap(naverMap);

        marker7.setPosition(new LatLng(37.44784142246018, 126.65155357112765));
        marker7.setCaptionText("모모하루");
        marker7.setMap(naverMap);

        marker8.setPosition(new LatLng(37.44748849615806, 126.65153366624149));
        marker8.setCaptionText("달초밥 인하");
        marker8.setMap(naverMap);

        marker9.setPosition(new LatLng(37.451693798363515, 126.65524591273902));
        marker9.setCaptionText("허수바이 돈까스");
        marker9.setMap(naverMap);

        marker10.setPosition(new LatLng(37.45167162005626, 126.65685029995505));
        marker10.setCaptionText("가메이");
        marker10.setMap(naverMap);
    }
}
