// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTrafficMirrorSessionsRequestBuilderOps(val self: DescribeTrafficMirrorSessionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionIdsAsScala(value: Option[Seq[String]]): DescribeTrafficMirrorSessionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.trafficMirrorSessionIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTrafficMirrorSessionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeTrafficMirrorSessionsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTrafficMirrorSessionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeTrafficMirrorSessionsRequestOps(val self: DescribeTrafficMirrorSessionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionIdsAsScala: Option[Seq[String]] =
    Option(self.trafficMirrorSessionIds).map { v =>
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
trait ToDescribeTrafficMirrorSessionsRequestOps {

  implicit def toDescribeTrafficMirrorSessionsRequestBuilderOps(
      v: DescribeTrafficMirrorSessionsRequest.Builder
  ): DescribeTrafficMirrorSessionsRequestBuilderOps = new DescribeTrafficMirrorSessionsRequestBuilderOps(v)

  implicit def toDescribeTrafficMirrorSessionsRequestOps(
      v: DescribeTrafficMirrorSessionsRequest
  ): DescribeTrafficMirrorSessionsRequestOps = new DescribeTrafficMirrorSessionsRequestOps(v)

}
