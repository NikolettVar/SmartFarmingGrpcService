// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appleproduction.proto

package grpc.apple.smartfarming;

public final class AppleProductionServiceImpl {
  private AppleProductionServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplePrice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplePrice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeeklyApplePrice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeeklyApplePrice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeeklyAppleSale_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeeklyAppleSale_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeeklyAppleSaleValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeeklyAppleSaleValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025appleproduction.proto\"%\n\nApplePrice\022\027\n" +
      "\017appleSalesPrice\030\001 \001(\t\".\n\020WeeklyApplePri" +
      "ce\022\032\n\022applePricesPerWeek\030\001 \001(\001\"0\n\017Weekly" +
      "AppleSale\022\035\n\025weeklyAppleSaleVolume\030\001 \001(\005" +
      "\"4\n\024WeeklyAppleSaleValue\022\034\n\024weeklyAppleS" +
      "aleValue\030\001 \001(\0012\224\001\n\026AppleProductionServic" +
      "e\0227\n\021applePriceChecker\022\013.ApplePrice\032\021.We" +
      "eklyApplePrice\"\0000\001\022A\n\020weeklyAppleSales\022\020" +
      ".WeeklyAppleSale\032\025.WeeklyAppleSaleValue\"" +
      "\000(\0010\001B7\n\027grpc.apple.smartfarmingB\032AppleP" +
      "roductionServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ApplePrice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ApplePrice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplePrice_descriptor,
        new java.lang.String[] { "AppleSalesPrice", });
    internal_static_WeeklyApplePrice_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WeeklyApplePrice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeeklyApplePrice_descriptor,
        new java.lang.String[] { "ApplePricesPerWeek", });
    internal_static_WeeklyAppleSale_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_WeeklyAppleSale_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeeklyAppleSale_descriptor,
        new java.lang.String[] { "WeeklyAppleSaleVolume", });
    internal_static_WeeklyAppleSaleValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_WeeklyAppleSaleValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeeklyAppleSaleValue_descriptor,
        new java.lang.String[] { "WeeklyAppleSaleValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
