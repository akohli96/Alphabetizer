// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alphabetize.proto

package io.alphabetizer.alphabetize.grpc;

public final class AlphabetizeProto {
  private AlphabetizeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_AlphabetizeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AlphabetizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_AlphabetizeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AlphabetizeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\021alphabetize.proto\"#\n\022AlphabetizeReques"
          + "t\022\r\n\005input\030\001 \001(\t\"%\n\023AlphabetizeResponse\022"
          + "\016\n\006output\030\001 \001(\t2I\n\013Alphabetize\022:\n\013alphab"
          + "etize\022\023.AlphabetizeRequest\032\024.Alphabetize"
          + "Response\"\000B6\n io.alphabetizer.alphabetiz"
          + "e.grpcB\020AlphabetizeProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_AlphabetizeRequest_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_AlphabetizeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_AlphabetizeRequest_descriptor,
            new java.lang.String[] {
              "Input",
            });
    internal_static_AlphabetizeResponse_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_AlphabetizeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_AlphabetizeResponse_descriptor,
            new java.lang.String[] {
              "Output",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
