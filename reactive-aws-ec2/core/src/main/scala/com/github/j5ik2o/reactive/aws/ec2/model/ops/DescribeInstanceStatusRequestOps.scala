// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceStatusRequestBuilderOps(val self: DescribeInstanceStatusRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeInstanceStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala(value: Option[Seq[String]]): DescribeInstanceStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAllInstancesAsScala(value: Option[Boolean]): DescribeInstanceStatusRequest.Builder = {
    value.fold(self) { v => self.includeAllInstances(v) }
  }

}

final class DescribeInstanceStatusRequestOps(val self: DescribeInstanceStatusRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala: Option[Seq[String]] =
    Option(self.instanceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAllInstancesAsScala: Option[Boolean] = Option(self.includeAllInstances)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceStatusRequestOps {

  implicit def toDescribeInstanceStatusRequestBuilderOps(
      v: DescribeInstanceStatusRequest.Builder
  ): DescribeInstanceStatusRequestBuilderOps = new DescribeInstanceStatusRequestBuilderOps(v)

  implicit def toDescribeInstanceStatusRequestOps(v: DescribeInstanceStatusRequest): DescribeInstanceStatusRequestOps =
    new DescribeInstanceStatusRequestOps(v)

}
