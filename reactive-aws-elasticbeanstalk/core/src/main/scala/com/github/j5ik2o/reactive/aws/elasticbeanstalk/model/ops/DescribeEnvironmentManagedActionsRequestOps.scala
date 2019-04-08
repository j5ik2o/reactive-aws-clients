// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentManagedActionsRequestBuilderOps(
    val self: DescribeEnvironmentManagedActionsRequest.Builder
) extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentManagedActionsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def environmentIdAsScala(value: Option[String]): DescribeEnvironmentManagedActionsRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def statusAsScala(value: Option[ActionStatus]): DescribeEnvironmentManagedActionsRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class DescribeEnvironmentManagedActionsRequestOps(val self: DescribeEnvironmentManagedActionsRequest)
    extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def statusAsScala: Option[ActionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentManagedActionsRequestOps {

  implicit def toDescribeEnvironmentManagedActionsRequestBuilderOps(
      v: DescribeEnvironmentManagedActionsRequest.Builder
  ): DescribeEnvironmentManagedActionsRequestBuilderOps = new DescribeEnvironmentManagedActionsRequestBuilderOps(v)

  implicit def toDescribeEnvironmentManagedActionsRequestOps(
      v: DescribeEnvironmentManagedActionsRequest
  ): DescribeEnvironmentManagedActionsRequestOps = new DescribeEnvironmentManagedActionsRequestOps(v)

}
