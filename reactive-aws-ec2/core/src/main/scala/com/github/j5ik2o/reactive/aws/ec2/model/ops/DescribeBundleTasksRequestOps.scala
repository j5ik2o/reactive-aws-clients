// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeBundleTasksRequestBuilderOps(val self: DescribeBundleTasksRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bundleIdsAsScala(value: Option[Seq[String]]): DescribeBundleTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.bundleIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeBundleTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

}

final class DescribeBundleTasksRequestOps(val self: DescribeBundleTasksRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bundleIdsAsScala: Option[Seq[String]] =
    Option(self.bundleIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeBundleTasksRequestOps {

  implicit def toDescribeBundleTasksRequestBuilderOps(
      v: DescribeBundleTasksRequest.Builder
  ): DescribeBundleTasksRequestBuilderOps = new DescribeBundleTasksRequestBuilderOps(v)

  implicit def toDescribeBundleTasksRequestOps(v: DescribeBundleTasksRequest): DescribeBundleTasksRequestOps =
    new DescribeBundleTasksRequestOps(v)

}
