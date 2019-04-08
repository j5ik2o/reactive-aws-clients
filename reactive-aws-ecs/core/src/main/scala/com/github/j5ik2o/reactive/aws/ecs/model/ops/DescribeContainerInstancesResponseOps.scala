// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeContainerInstancesResponseBuilderOps(val self: DescribeContainerInstancesResponse.Builder)
    extends AnyVal {

  final def containerInstancesAsScala(
      value: Option[Seq[ContainerInstance]]
  ): DescribeContainerInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerInstances(v.asJava)
    }
  }

  final def failuresAsScala(value: Option[Seq[Failure]]): DescribeContainerInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.failures(v.asJava)
    }
  }

}

final class DescribeContainerInstancesResponseOps(val self: DescribeContainerInstancesResponse) extends AnyVal {

  final def containerInstancesAsScala: Option[Seq[ContainerInstance]] = Option(self.containerInstances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeContainerInstancesResponseOps {

  implicit def toDescribeContainerInstancesResponseBuilderOps(
      v: DescribeContainerInstancesResponse.Builder
  ): DescribeContainerInstancesResponseBuilderOps = new DescribeContainerInstancesResponseBuilderOps(v)

  implicit def toDescribeContainerInstancesResponseOps(
      v: DescribeContainerInstancesResponse
  ): DescribeContainerInstancesResponseOps = new DescribeContainerInstancesResponseOps(v)

}
