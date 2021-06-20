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

public class KoreaActivity extends AppCompatActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_korea);

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

        marker1.setPosition(new LatLng(37.45176380939909, 126.65647741040178));
        marker1.setCaptionText("낭풍 인하대점");
        marker1.setMap(naverMap);

        marker2.setPosition(new LatLng(37.45175103351805, 126.65648277481942));
        marker2.setCaptionText("더진국 인하대점");
        marker2.setMap(naverMap);

        marker3.setPosition(new LatLng(37.44759798829602, 126.65196937539008));
        marker3.setCaptionText("가마솥 순대국");
        marker3.setMap(naverMap);

        marker4.setPosition(new LatLng(37.4533287741673, 126.6580017451459));
        marker4.setCaptionText("인하순대");
        marker4.setMap(naverMap);

        marker5.setPosition(new LatLng(37.45196149484757, 126.6543468533017));
        marker5.setCaptionText("찌개사랑");
        marker5.setMap(naverMap);

        marker5.setPosition(new LatLng(37.45092631198876, 126.65850822446635));
        marker5.setCaptionText("시내비골");
        marker5.setMap(naverMap);

        marker6.setPosition(new LatLng(37.452006550724775, 126.65705140309329));
        marker6.setCaptionText("시골집");
        marker6.setMap(naverMap);

        marker7.setPosition(new LatLng(37.45181065427767, 126.65629502020072));
        marker7.setCaptionText("삼겹살에 소주한잔");
        marker7.setMap(naverMap);

        marker8.setPosition(new LatLng(37.45158550965279, 126.65815294344382));
        marker8.setCaptionText("춘천 닭갈비 인하대점");
        marker8.setMap(naverMap);

        marker9.setPosition(new LatLng(37.45155502001974, 126.65809259046146));
        marker9.setCaptionText("종로순대");
        marker9.setMap(naverMap);

        marker10.setPosition(new LatLng(37.45165308502405, 126.65621455393553));
        marker10.setCaptionText("경동삼겹살");
        marker10.setMap(naverMap);
    }
}
