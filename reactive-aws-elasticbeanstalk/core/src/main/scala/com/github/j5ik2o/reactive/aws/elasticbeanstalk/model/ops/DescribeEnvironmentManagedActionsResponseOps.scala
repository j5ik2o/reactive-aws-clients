// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentManagedActionsResponseBuilderOps(
    val self: DescribeEnvironmentManagedActionsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedActionsAsScala(
      value: Option[Seq[ManagedAction]]
  ): DescribeEnvironmentManagedActionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.managedActions(v.asJava)
    }
  }

}

final class DescribeEnvironmentManagedActionsResponseOps(val self: DescribeEnvironmentManagedActionsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managedActionsAsScala: Option[Seq[ManagedAction]] =
    Option(self.managedActions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentManagedActionsResponseOps {

  implicit def toDescribeEnvironmentManagedActionsResponseBuilderOps(
      v: DescribeEnvironmentManagedActionsResponse.Builder
  ): DescribeEnvironmentManagedActionsResponseBuilderOps = new DescribeEnvironmentManagedActionsResponseBuilderOps(v)

  implicit def toDescribeEnvironmentManagedActionsResponseOps(
      v: DescribeEnvironmentManagedActionsResponse
  ): DescribeEnvironmentManagedActionsResponseOps = new DescribeEnvironmentManagedActionsResponseOps(v)

}
