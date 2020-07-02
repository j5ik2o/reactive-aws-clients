// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeBackupRequestBuilderOps(val self: DescribeBackupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala(value: Option[String]): DescribeBackupRequest.Builder = {
    value.fold(self) { v => self.backupArn(v) }
  }

}

final class DescribeBackupRequestOps(val self: DescribeBackupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def backupArnAsScala: Option[String] = Option(self.backupArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeBackupRequestOps {

  implicit def toDescribeBackupRequestBuilderOps(v: DescribeBackupRequest.Builder): DescribeBackupRequestBuilderOps =
    new DescribeBackupRequestBuilderOps(v)

  implicit def toDescribeBackupRequestOps(v: DescribeBackupRequest): DescribeBackupRequestOps =
    new DescribeBackupRequestOps(v)

}
