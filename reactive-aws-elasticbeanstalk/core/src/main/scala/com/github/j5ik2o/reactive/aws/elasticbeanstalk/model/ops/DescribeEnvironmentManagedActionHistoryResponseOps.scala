// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentManagedActionHistoryResponseBuilderOps(
    val self: DescribeEnvironmentManagedActionHistoryResponse.Builder
) extends AnyVal {

  final def managedActionHistoryItemsAsScala(
      value: Option[Seq[ManagedActionHistoryItem]]
  ): DescribeEnvironmentManagedActionHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.managedActionHistoryItems(v.asJava)
    } // Seq[ManagedActionHistoryItem]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeEnvironmentManagedActionHistoryResponseOps(
    val self: DescribeEnvironmentManagedActionHistoryResponse
) extends AnyVal {

  final def managedActionHistoryItemsAsScala: Option[Seq[ManagedActionHistoryItem]] =
    Option(self.managedActionHistoryItems).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[ManagedActionHistoryItem]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

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
