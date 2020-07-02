// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIamInstanceProfileAssociationsRequestBuilderOps(
    val self: DescribeIamInstanceProfileAssociationsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdsAsScala(value: Option[Seq[String]]): DescribeIamInstanceProfileAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.associationIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeIamInstanceProfileAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeIamInstanceProfileAssociationsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeIamInstanceProfileAssociationsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeIamInstanceProfileAssociationsRequestOps(val self: DescribeIamInstanceProfileAssociationsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdsAsScala: Option[Seq[String]] =
    Option(self.associationIds).map { v =>
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
trait ToDescribeIamInstanceProfileAssociationsRequestOps {

  implicit def toDescribeIamInstanceProfileAssociationsRequestBuilderOps(
      v: DescribeIamInstanceProfileAssociationsRequest.Builder
  ): DescribeIamInstanceProfileAssociationsRequestBuilderOps =
    new DescribeIamInstanceProfileAssociationsRequestBuilderOps(v)

  implicit def toDescribeIamInstanceProfileAssociationsRequestOps(
      v: DescribeIamInstanceProfileAssociationsRequest
  ): DescribeIamInstanceProfileAssociationsRequestOps = new DescribeIamInstanceProfileAssociationsRequestOps(v)

}
