// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTrafficMirrorTargetsRequestBuilderOps(val self: DescribeTrafficMirrorTargetsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdsAsScala(value: Option[Seq[String]]): DescribeTrafficMirrorTargetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.trafficMirrorTargetIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTrafficMirrorTargetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeTrafficMirrorTargetsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTrafficMirrorTargetsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeTrafficMirrorTargetsRequestOps(val self: DescribeTrafficMirrorTargetsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdsAsScala: Option[Seq[String]] =
    Option(self.trafficMirrorTargetIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTrafficMirrorTargetsRequestOps {

  implicit def toDescribeTrafficMirrorTargetsRequestBuilderOps(
      v: DescribeTrafficMirrorTargetsRequest.Builder
  ): DescribeTrafficMirrorTargetsRequestBuilderOps = new DescribeTrafficMirrorTargetsRequestBuilderOps(v)

  implicit def toDescribeTrafficMirrorTargetsRequestOps(
      v: DescribeTrafficMirrorTargetsRequest
  ): DescribeTrafficMirrorTargetsRequestOps = new DescribeTrafficMirrorTargetsRequestOps(v)

}
