// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentManagedActionHistoryResponseBuilderOps(
    val self: DescribeEnvironmentManagedActionHistoryResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedActionHistoryItemsAsScala(
      value: Option[Seq[ManagedActionHistoryItem]]
  ): DescribeEnvironmentManagedActionHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.managedActionHistoryItems(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeEnvironmentManagedActionHistoryResponseOps(
    val self: DescribeEnvironmentManagedActionHistoryResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedActionHistoryItemsAsScala: Option[Seq[ManagedActionHistoryItem]] =
    Option(self.managedActionHistoryItems).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentManagedActionHistoryResponseOps {

  implicit def toDescribeEnvironmentManagedActionHistoryResponseBuilderOps(
      v: DescribeEnvironmentManagedActionHistoryResponse.Builder
  ): DescribeEnvironmentManagedActionHistoryResponseBuilderOps =
    new DescribeEnvironmentManagedActionHistoryResponseBuilderOps(v)

  implicit def toDescribeEnvironmentManagedActionHistoryResponseOps(
      v: DescribeEnvironmentManagedActionHistoryResponse
  ): DescribeEnvironmentManagedActionHistoryResponseOps = new DescribeEnvironmentManagedActionHistoryResponseOps(v)

}
