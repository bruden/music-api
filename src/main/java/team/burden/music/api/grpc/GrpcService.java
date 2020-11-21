package team.burden.music.api.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import team.burden.music.api.protos.Grpc;
import team.burden.music.api.protos.GrpcServiceGrpc;
import team.burden.music.api.protos.Music;
import team.burden.music.api.service.SongService;

import javax.annotation.Resource;

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
    public void queryAllSongs(Grpc.QueryAllSongsRequest request, StreamObserver<Grpc.QueryAllSongsResponse> responseObserver) {
        Grpc.QueryAllSongsResponse.Builder builder = Grpc.QueryAllSongsResponse.newBuilder();
        for (Grpc.SongWithoutTones songWithoutTones : songService.getSongs()) {
            builder.addSongs(songWithoutTones);
        }
        Grpc.QueryAllSongsResponse response = builder.build();
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
