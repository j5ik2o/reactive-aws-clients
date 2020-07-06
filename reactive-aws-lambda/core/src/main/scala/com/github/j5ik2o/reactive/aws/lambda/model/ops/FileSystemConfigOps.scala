// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class FileSystemConfigBuilderOps(val self: FileSystemConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): FileSystemConfig.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localMountPathAsScala(value: Option[String]): FileSystemConfig.Builder = {
    value.fold(self) { v => self.localMountPath(v) }
  }

}

final class FileSystemConfigOps(val self: FileSystemConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localMountPathAsScala: Option[String] = Option(self.localMountPath)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFileSystemConfigOps {

  implicit def toFileSystemConfigBuilderOps(v: FileSystemConfig.Builder): FileSystemConfigBuilderOps =
    new FileSystemConfigBuilderOps(v)

  implicit def toFileSystemConfigOps(v: FileSystemConfig): FileSystemConfigOps = new FileSystemConfigOps(v)

}
