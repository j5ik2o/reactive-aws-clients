// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentManagedActionHistoryRequestBuilderOps(
    val self: DescribeEnvironmentManagedActionHistoryRequest.Builder
) extends AnyVal {

  final def environmentIdAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  } // String

  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def maxItemsAsScala(value: Option[Int]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  } // Int

}

final class DescribeEnvironmentManagedActionHistoryRequestOps(val self: DescribeEnvironmentManagedActionHistoryRequest)
    extends AnyVal {

  final def environmentIdAsScala: Option[String] = Option(self.environmentId) // String

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentManagedActionHistoryRequestOps {

  implicit def toDescribeEnvironmentManagedActionHistoryRequestBuilderOps(
      v: DescribeEnvironmentManagedActionHistoryRequest.Builder
  ): DescribeEnvironmentManagedActionHistoryRequestBuilderOps =
    new DescribeEnvironmentManagedActionHistoryRequestBuilderOps(v)

  implicit def toDescribeEnvironmentManagedActionHistoryRequestOps(
      v: DescribeEnvironmentManagedActionHistoryRequest
  ): DescribeEnvironmentManagedActionHistoryRequestOps = new DescribeEnvironmentManagedActionHistoryRequestOps(v)

}
