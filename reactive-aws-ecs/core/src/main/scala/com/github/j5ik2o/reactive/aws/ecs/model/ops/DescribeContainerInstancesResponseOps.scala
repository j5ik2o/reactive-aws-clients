// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeContainerInstancesResponseBuilderOps(val self: DescribeContainerInstancesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala(
      value: Option[Seq[ContainerInstance]]
  ): DescribeContainerInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerInstances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[Failure]]): DescribeContainerInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class DescribeContainerInstancesResponseOps(val self: DescribeContainerInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstancesAsScala: Option[Seq[ContainerInstance]] =
    Option(self.containerInstances).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[Failure]] =
    Option(self.failures).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

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
