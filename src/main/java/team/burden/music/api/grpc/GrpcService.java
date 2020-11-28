package team.burden.music.api.grpc;

import io.grpc.stub.StreamObserver;
import javafx.util.Pair;
import org.lognet.springboot.grpc.GRpcService;
import team.burden.music.api.protos.Grpc;
import team.burden.music.api.protos.GrpcServiceGrpc;
import team.burden.music.api.protos.Music;
import team.burden.music.api.service.SongService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: music-api
 * @description:
 * @author: burden
 * @create: 2020-11-21 15:08
 */
@GRpcService
public class GrpcService extends GrpcServiceGrpc.GrpcServiceImplBase {

    @Resource
    private SongService songService;

    @Override
    public void addSong(Grpc.AddSongRequest request, StreamObserver<Grpc.AddSongResponse> responseObserver) {
        boolean result = songService.addSong(request.getSong());
        Grpc.AddSongResponse response = Grpc.AddSongResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void querySongs(Grpc.QuerySongsRequest request, StreamObserver<Grpc.QuerySongsResponse> responseObserver) {
        Pair<List<Grpc.SongWithoutTones>, Integer> result = songService.getSongs(request.getText(), request.getOffset(), request.getSize());
        Grpc.QuerySongsResponse.Builder builder = Grpc.QuerySongsResponse.newBuilder().setCount(result.getValue());
        for (Grpc.SongWithoutTones songWithoutTones : result.getKey()) {
            builder.addSongs(songWithoutTones);
        }
        Grpc.QuerySongsResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void querySong(Grpc.QuerySongRequest request, StreamObserver<Grpc.QuerySongResponse> responseObserver) {
        Music.Song song = songService.getSong(request.getTitle());
        Grpc.QuerySongResponse response = Grpc.QuerySongResponse.newBuilder().setSong(song).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
