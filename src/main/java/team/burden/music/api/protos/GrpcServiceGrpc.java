package team.burden.music.api.protos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: Grpc.proto")
public final class GrpcServiceGrpc {

  private GrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "GrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.AddSongRequest,
      team.burden.music.api.protos.Grpc.AddSongResponse> getAddSongMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSong",
      requestType = team.burden.music.api.protos.Grpc.AddSongRequest.class,
      responseType = team.burden.music.api.protos.Grpc.AddSongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.AddSongRequest,
      team.burden.music.api.protos.Grpc.AddSongResponse> getAddSongMethod() {
    io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.AddSongRequest, team.burden.music.api.protos.Grpc.AddSongResponse> getAddSongMethod;
    if ((getAddSongMethod = GrpcServiceGrpc.getAddSongMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getAddSongMethod = GrpcServiceGrpc.getAddSongMethod) == null) {
          GrpcServiceGrpc.getAddSongMethod = getAddSongMethod =
              io.grpc.MethodDescriptor.<team.burden.music.api.protos.Grpc.AddSongRequest, team.burden.music.api.protos.Grpc.AddSongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addSong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  team.burden.music.api.protos.Grpc.AddSongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  team.burden.music.api.protos.Grpc.AddSongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("addSong"))
              .build();
        }
      }
    }
    return getAddSongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.QuerySongsRequest,
      team.burden.music.api.protos.Grpc.QuerySongsResponse> getQuerySongsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "querySongs",
      requestType = team.burden.music.api.protos.Grpc.QuerySongsRequest.class,
      responseType = team.burden.music.api.protos.Grpc.QuerySongsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.QuerySongsRequest,
      team.burden.music.api.protos.Grpc.QuerySongsResponse> getQuerySongsMethod() {
    io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.QuerySongsRequest, team.burden.music.api.protos.Grpc.QuerySongsResponse> getQuerySongsMethod;
    if ((getQuerySongsMethod = GrpcServiceGrpc.getQuerySongsMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getQuerySongsMethod = GrpcServiceGrpc.getQuerySongsMethod) == null) {
          GrpcServiceGrpc.getQuerySongsMethod = getQuerySongsMethod =
              io.grpc.MethodDescriptor.<team.burden.music.api.protos.Grpc.QuerySongsRequest, team.burden.music.api.protos.Grpc.QuerySongsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "querySongs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  team.burden.music.api.protos.Grpc.QuerySongsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  team.burden.music.api.protos.Grpc.QuerySongsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("querySongs"))
              .build();
        }
      }
    }
    return getQuerySongsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.QuerySongRequest,
      team.burden.music.api.protos.Grpc.QuerySongResponse> getQuerySongMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "querySong",
      requestType = team.burden.music.api.protos.Grpc.QuerySongRequest.class,
      responseType = team.burden.music.api.protos.Grpc.QuerySongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.QuerySongRequest,
      team.burden.music.api.protos.Grpc.QuerySongResponse> getQuerySongMethod() {
    io.grpc.MethodDescriptor<team.burden.music.api.protos.Grpc.QuerySongRequest, team.burden.music.api.protos.Grpc.QuerySongResponse> getQuerySongMethod;
    if ((getQuerySongMethod = GrpcServiceGrpc.getQuerySongMethod) == null) {
      synchronized (GrpcServiceGrpc.class) {
        if ((getQuerySongMethod = GrpcServiceGrpc.getQuerySongMethod) == null) {
          GrpcServiceGrpc.getQuerySongMethod = getQuerySongMethod =
              io.grpc.MethodDescriptor.<team.burden.music.api.protos.Grpc.QuerySongRequest, team.burden.music.api.protos.Grpc.QuerySongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "querySong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  team.burden.music.api.protos.Grpc.QuerySongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  team.burden.music.api.protos.Grpc.QuerySongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcServiceMethodDescriptorSupplier("querySong"))
              .build();
        }
      }
    }
    return getQuerySongMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceStub>() {
        @java.lang.Override
        public GrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceStub(channel, callOptions);
        }
      };
    return GrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceBlockingStub>() {
        @java.lang.Override
        public GrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return GrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcServiceFutureStub>() {
        @java.lang.Override
        public GrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcServiceFutureStub(channel, callOptions);
        }
      };
    return GrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addSong(team.burden.music.api.protos.Grpc.AddSongRequest request,
        io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.AddSongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSongMethod(), responseObserver);
    }

    /**
     */
    public void querySongs(team.burden.music.api.protos.Grpc.QuerySongsRequest request,
        io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.QuerySongsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySongsMethod(), responseObserver);
    }

    /**
     */
    public void querySong(team.burden.music.api.protos.Grpc.QuerySongRequest request,
        io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.QuerySongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySongMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddSongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                team.burden.music.api.protos.Grpc.AddSongRequest,
                team.burden.music.api.protos.Grpc.AddSongResponse>(
                  this, METHODID_ADD_SONG)))
          .addMethod(
            getQuerySongsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                team.burden.music.api.protos.Grpc.QuerySongsRequest,
                team.burden.music.api.protos.Grpc.QuerySongsResponse>(
                  this, METHODID_QUERY_SONGS)))
          .addMethod(
            getQuerySongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                team.burden.music.api.protos.Grpc.QuerySongRequest,
                team.burden.music.api.protos.Grpc.QuerySongResponse>(
                  this, METHODID_QUERY_SONG)))
          .build();
    }
  }

  /**
   */
  public static final class GrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<GrpcServiceStub> {
    private GrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void addSong(team.burden.music.api.protos.Grpc.AddSongRequest request,
        io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.AddSongResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySongs(team.burden.music.api.protos.Grpc.QuerySongsRequest request,
        io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.QuerySongsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySongsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySong(team.burden.music.api.protos.Grpc.QuerySongRequest request,
        io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.QuerySongResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySongMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GrpcServiceBlockingStub> {
    private GrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public team.burden.music.api.protos.Grpc.AddSongResponse addSong(team.burden.music.api.protos.Grpc.AddSongRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddSongMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.burden.music.api.protos.Grpc.QuerySongsResponse querySongs(team.burden.music.api.protos.Grpc.QuerySongsRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySongsMethod(), getCallOptions(), request);
    }

    /**
     */
    public team.burden.music.api.protos.Grpc.QuerySongResponse querySong(team.burden.music.api.protos.Grpc.QuerySongRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySongMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GrpcServiceFutureStub> {
    private GrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.burden.music.api.protos.Grpc.AddSongResponse> addSong(
        team.burden.music.api.protos.Grpc.AddSongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSongMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.burden.music.api.protos.Grpc.QuerySongsResponse> querySongs(
        team.burden.music.api.protos.Grpc.QuerySongsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySongsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<team.burden.music.api.protos.Grpc.QuerySongResponse> querySong(
        team.burden.music.api.protos.Grpc.QuerySongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySongMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_SONG = 0;
  private static final int METHODID_QUERY_SONGS = 1;
  private static final int METHODID_QUERY_SONG = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_SONG:
          serviceImpl.addSong((team.burden.music.api.protos.Grpc.AddSongRequest) request,
              (io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.AddSongResponse>) responseObserver);
          break;
        case METHODID_QUERY_SONGS:
          serviceImpl.querySongs((team.burden.music.api.protos.Grpc.QuerySongsRequest) request,
              (io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.QuerySongsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SONG:
          serviceImpl.querySong((team.burden.music.api.protos.Grpc.QuerySongRequest) request,
              (io.grpc.stub.StreamObserver<team.burden.music.api.protos.Grpc.QuerySongResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return team.burden.music.api.protos.Grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcService");
    }
  }

  private static final class GrpcServiceFileDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier {
    GrpcServiceFileDescriptorSupplier() {}
  }

  private static final class GrpcServiceMethodDescriptorSupplier
      extends GrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcServiceFileDescriptorSupplier())
              .addMethod(getAddSongMethod())
              .addMethod(getQuerySongsMethod())
              .addMethod(getQuerySongMethod())
              .build();
        }
      }
    }
    return result;
  }
}
