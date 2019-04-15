package io.alphabetizer.alphabetize.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: alphabetize.proto")
public final class AlphabetizeGrpc {

  private AlphabetizeGrpc() {}

  public static final String SERVICE_NAME = "Alphabetize";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlphabetizeMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
          io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
      METHOD_ALPHABETIZE = getAlphabetizeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
          io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
      getAlphabetizeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
          io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
      getAlphabetizeMethod() {
    return getAlphabetizeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
          io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
      getAlphabetizeMethodHelper() {
    io.grpc.MethodDescriptor<
            io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
            io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
        getAlphabetizeMethod;
    if ((getAlphabetizeMethod = AlphabetizeGrpc.getAlphabetizeMethod) == null) {
      synchronized (AlphabetizeGrpc.class) {
        if ((getAlphabetizeMethod = AlphabetizeGrpc.getAlphabetizeMethod) == null) {
          AlphabetizeGrpc.getAlphabetizeMethod =
              getAlphabetizeMethod =
                  io.grpc.MethodDescriptor
                      .<io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
                          io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName("Alphabetize", "alphabetize"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.alphabetizer.alphabetize.grpc.AlphabetizeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              io.alphabetizer.alphabetize.grpc.AlphabetizeResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new AlphabetizeMethodDescriptorSupplier("alphabetize"))
                      .build();
        }
      }
    }
    return getAlphabetizeMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AlphabetizeStub newStub(io.grpc.Channel channel) {
    return new AlphabetizeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlphabetizeBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new AlphabetizeBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AlphabetizeFutureStub newFutureStub(io.grpc.Channel channel) {
    return new AlphabetizeFutureStub(channel);
  }

  /** */
  public abstract static class AlphabetizeImplBase implements io.grpc.BindableService {

    /** */
    public void alphabetize(
        io.alphabetizer.alphabetize.grpc.AlphabetizeRequest request,
        io.grpc.stub.StreamObserver<io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getAlphabetizeMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getAlphabetizeMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      io.alphabetizer.alphabetize.grpc.AlphabetizeRequest,
                      io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>(
                      this, METHODID_ALPHABETIZE)))
          .build();
    }
  }

  /** */
  public static final class AlphabetizeStub extends io.grpc.stub.AbstractStub<AlphabetizeStub> {
    private AlphabetizeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlphabetizeStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlphabetizeStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlphabetizeStub(channel, callOptions);
    }

    /** */
    public void alphabetize(
        io.alphabetizer.alphabetize.grpc.AlphabetizeRequest request,
        io.grpc.stub.StreamObserver<io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlphabetizeMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class AlphabetizeBlockingStub
      extends io.grpc.stub.AbstractStub<AlphabetizeBlockingStub> {
    private AlphabetizeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlphabetizeBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlphabetizeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlphabetizeBlockingStub(channel, callOptions);
    }

    /** */
    public io.alphabetizer.alphabetize.grpc.AlphabetizeResponse alphabetize(
        io.alphabetizer.alphabetize.grpc.AlphabetizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlphabetizeMethodHelper(), getCallOptions(), request);
    }
  }

  /** */
  public static final class AlphabetizeFutureStub
      extends io.grpc.stub.AbstractStub<AlphabetizeFutureStub> {
    private AlphabetizeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlphabetizeFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlphabetizeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlphabetizeFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>
        alphabetize(io.alphabetizer.alphabetize.grpc.AlphabetizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlphabetizeMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALPHABETIZE = 0;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlphabetizeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlphabetizeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALPHABETIZE:
          serviceImpl.alphabetize(
              (io.alphabetizer.alphabetize.grpc.AlphabetizeRequest) request,
              (io.grpc.stub.StreamObserver<io.alphabetizer.alphabetize.grpc.AlphabetizeResponse>)
                  responseObserver);
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

  private abstract static class AlphabetizeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlphabetizeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.alphabetizer.alphabetize.grpc.AlphabetizeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Alphabetize");
    }
  }

  private static final class AlphabetizeFileDescriptorSupplier
      extends AlphabetizeBaseDescriptorSupplier {
    AlphabetizeFileDescriptorSupplier() {}
  }

  private static final class AlphabetizeMethodDescriptorSupplier
      extends AlphabetizeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlphabetizeMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlphabetizeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AlphabetizeFileDescriptorSupplier())
                      .addMethod(getAlphabetizeMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
