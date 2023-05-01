// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serverchat.proto

package com.example.grpc.chat.server;

/**
 * Protobuf type {@code chat.ChatMessageFromServer}
 */
public  final class ChatMessageFromServer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chat.ChatMessageFromServer)
    ChatMessageFromServerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatMessageFromServer.newBuilder() to construct.
  private ChatMessageFromServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatMessageFromServer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatMessageFromServer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChatMessageFromServer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.example.grpc.chat.server.ChatMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.example.grpc.chat.server.ChatMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.example.grpc.chat.server.ChatProto.internal_static_chat_ChatMessageFromServer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.chat.server.ChatProto.internal_static_chat_ChatMessageFromServer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.chat.server.ChatMessageFromServer.class, com.example.grpc.chat.server.ChatMessageFromServer.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.example.grpc.chat.server.ChatMessage message_;
  /**
   * <code>.chat.ChatMessage message = 1;</code>
   * @return Whether the message field is set.
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <code>.chat.ChatMessage message = 1;</code>
   * @return The message.
   */
  public com.example.grpc.chat.server.ChatMessage getMessage() {
    return message_ == null ? com.example.grpc.chat.server.ChatMessage.getDefaultInstance() : message_;
  }
  /**
   * <code>.chat.ChatMessage message = 1;</code>
   */
  public com.example.grpc.chat.server.ChatMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
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
    if (message_ != null) {
      output.writeMessage(1, getMessage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
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
    if (!(obj instanceof com.example.grpc.chat.server.ChatMessageFromServer)) {
      return super.equals(obj);
    }
    com.example.grpc.chat.server.ChatMessageFromServer other = (com.example.grpc.chat.server.ChatMessageFromServer) obj;

    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.chat.server.ChatMessageFromServer parseFrom(
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
  public static Builder newBuilder(com.example.grpc.chat.server.ChatMessageFromServer prototype) {
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
   * Protobuf type {@code chat.ChatMessageFromServer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chat.ChatMessageFromServer)
      com.example.grpc.chat.server.ChatMessageFromServerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.chat.server.ChatProto.internal_static_chat_ChatMessageFromServer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.chat.server.ChatProto.internal_static_chat_ChatMessageFromServer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.chat.server.ChatMessageFromServer.class, com.example.grpc.chat.server.ChatMessageFromServer.Builder.class);
    }

    // Construct using com.example.grpc.chat.server.ChatMessageFromServer.newBuilder()
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
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.chat.server.ChatProto.internal_static_chat_ChatMessageFromServer_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.chat.server.ChatMessageFromServer getDefaultInstanceForType() {
      return com.example.grpc.chat.server.ChatMessageFromServer.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.chat.server.ChatMessageFromServer build() {
      com.example.grpc.chat.server.ChatMessageFromServer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.chat.server.ChatMessageFromServer buildPartial() {
      com.example.grpc.chat.server.ChatMessageFromServer result = new com.example.grpc.chat.server.ChatMessageFromServer(this);
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.chat.server.ChatMessageFromServer) {
        return mergeFrom((com.example.grpc.chat.server.ChatMessageFromServer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.chat.server.ChatMessageFromServer other) {
      if (other == com.example.grpc.chat.server.ChatMessageFromServer.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
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
      com.example.grpc.chat.server.ChatMessageFromServer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.chat.server.ChatMessageFromServer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.grpc.chat.server.ChatMessage message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.chat.server.ChatMessage, com.example.grpc.chat.server.ChatMessage.Builder, com.example.grpc.chat.server.ChatMessageOrBuilder> messageBuilder_;
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     * @return The message.
     */
    public com.example.grpc.chat.server.ChatMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.example.grpc.chat.server.ChatMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    public Builder setMessage(com.example.grpc.chat.server.ChatMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    public Builder setMessage(
        com.example.grpc.chat.server.ChatMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    public Builder mergeMessage(com.example.grpc.chat.server.ChatMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            com.example.grpc.chat.server.ChatMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    public com.example.grpc.chat.server.ChatMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    public com.example.grpc.chat.server.ChatMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.example.grpc.chat.server.ChatMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>.chat.ChatMessage message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.chat.server.ChatMessage, com.example.grpc.chat.server.ChatMessage.Builder, com.example.grpc.chat.server.ChatMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.chat.server.ChatMessage, com.example.grpc.chat.server.ChatMessage.Builder, com.example.grpc.chat.server.ChatMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:chat.ChatMessageFromServer)
  }

  // @@protoc_insertion_point(class_scope:chat.ChatMessageFromServer)
  private static final com.example.grpc.chat.server.ChatMessageFromServer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.chat.server.ChatMessageFromServer();
  }

  public static com.example.grpc.chat.server.ChatMessageFromServer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatMessageFromServer>
      PARSER = new com.google.protobuf.AbstractParser<ChatMessageFromServer>() {
    @java.lang.Override
    public ChatMessageFromServer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChatMessageFromServer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChatMessageFromServer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatMessageFromServer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.chat.server.ChatMessageFromServer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

