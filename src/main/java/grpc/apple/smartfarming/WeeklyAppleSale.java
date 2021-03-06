// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appleproduction.proto

package grpc.apple.smartfarming;

/**
 * <pre>
 *request messages contain an int, the amount of apples sold weekly
 * </pre>
 *
 * Protobuf type {@code WeeklyAppleSale}
 */
public  final class WeeklyAppleSale extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WeeklyAppleSale)
    WeeklyAppleSaleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeeklyAppleSale.newBuilder() to construct.
  private WeeklyAppleSale(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeeklyAppleSale() {
    weeklyAppleSaleVolume_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeeklyAppleSale(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            weeklyAppleSaleVolume_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyAppleSale_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyAppleSale_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.apple.smartfarming.WeeklyAppleSale.class, grpc.apple.smartfarming.WeeklyAppleSale.Builder.class);
  }

  public static final int WEEKLYAPPLESALEVOLUME_FIELD_NUMBER = 1;
  private int weeklyAppleSaleVolume_;
  /**
   * <code>int32 weeklyAppleSaleVolume = 1;</code>
   */
  public int getWeeklyAppleSaleVolume() {
    return weeklyAppleSaleVolume_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (weeklyAppleSaleVolume_ != 0) {
      output.writeInt32(1, weeklyAppleSaleVolume_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weeklyAppleSaleVolume_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, weeklyAppleSaleVolume_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.apple.smartfarming.WeeklyAppleSale)) {
      return super.equals(obj);
    }
    grpc.apple.smartfarming.WeeklyAppleSale other = (grpc.apple.smartfarming.WeeklyAppleSale) obj;

    boolean result = true;
    result = result && (getWeeklyAppleSaleVolume()
        == other.getWeeklyAppleSaleVolume());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WEEKLYAPPLESALEVOLUME_FIELD_NUMBER;
    hash = (53 * hash) + getWeeklyAppleSaleVolume();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.apple.smartfarming.WeeklyAppleSale parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.apple.smartfarming.WeeklyAppleSale prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *request messages contain an int, the amount of apples sold weekly
   * </pre>
   *
   * Protobuf type {@code WeeklyAppleSale}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WeeklyAppleSale)
      grpc.apple.smartfarming.WeeklyAppleSaleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyAppleSale_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyAppleSale_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.apple.smartfarming.WeeklyAppleSale.class, grpc.apple.smartfarming.WeeklyAppleSale.Builder.class);
    }

    // Construct using grpc.apple.smartfarming.WeeklyAppleSale.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      weeklyAppleSaleVolume_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.apple.smartfarming.AppleProductionServiceImpl.internal_static_WeeklyAppleSale_descriptor;
    }

    @java.lang.Override
    public grpc.apple.smartfarming.WeeklyAppleSale getDefaultInstanceForType() {
      return grpc.apple.smartfarming.WeeklyAppleSale.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.apple.smartfarming.WeeklyAppleSale build() {
      grpc.apple.smartfarming.WeeklyAppleSale result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.apple.smartfarming.WeeklyAppleSale buildPartial() {
      grpc.apple.smartfarming.WeeklyAppleSale result = new grpc.apple.smartfarming.WeeklyAppleSale(this);
      result.weeklyAppleSaleVolume_ = weeklyAppleSaleVolume_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.apple.smartfarming.WeeklyAppleSale) {
        return mergeFrom((grpc.apple.smartfarming.WeeklyAppleSale)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.apple.smartfarming.WeeklyAppleSale other) {
      if (other == grpc.apple.smartfarming.WeeklyAppleSale.getDefaultInstance()) return this;
      if (other.getWeeklyAppleSaleVolume() != 0) {
        setWeeklyAppleSaleVolume(other.getWeeklyAppleSaleVolume());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.apple.smartfarming.WeeklyAppleSale parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.apple.smartfarming.WeeklyAppleSale) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int weeklyAppleSaleVolume_ ;
    /**
     * <code>int32 weeklyAppleSaleVolume = 1;</code>
     */
    public int getWeeklyAppleSaleVolume() {
      return weeklyAppleSaleVolume_;
    }
    /**
     * <code>int32 weeklyAppleSaleVolume = 1;</code>
     */
    public Builder setWeeklyAppleSaleVolume(int value) {
      
      weeklyAppleSaleVolume_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 weeklyAppleSaleVolume = 1;</code>
     */
    public Builder clearWeeklyAppleSaleVolume() {
      
      weeklyAppleSaleVolume_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:WeeklyAppleSale)
  }

  // @@protoc_insertion_point(class_scope:WeeklyAppleSale)
  private static final grpc.apple.smartfarming.WeeklyAppleSale DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.apple.smartfarming.WeeklyAppleSale();
  }

  public static grpc.apple.smartfarming.WeeklyAppleSale getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeeklyAppleSale>
      PARSER = new com.google.protobuf.AbstractParser<WeeklyAppleSale>() {
    @java.lang.Override
    public WeeklyAppleSale parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeeklyAppleSale(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeeklyAppleSale> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeeklyAppleSale> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.apple.smartfarming.WeeklyAppleSale getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

