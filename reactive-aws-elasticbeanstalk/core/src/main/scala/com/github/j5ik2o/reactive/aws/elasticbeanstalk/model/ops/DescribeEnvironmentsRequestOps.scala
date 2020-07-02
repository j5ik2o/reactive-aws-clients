// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentsRequestBuilderOps(val self: DescribeEnvironmentsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala(value: Option[String]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v => self.versionLabel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdsAsScala(value: Option[Seq[String]]): DescribeEnvironmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environmentIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNamesAsScala(value: Option[Seq[String]]): DescribeEnvironmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environmentNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeDeletedAsScala(value: Option[Boolean]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v => self.includeDeleted(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includedDeletedBackToAsScala(value: Option[java.time.Instant]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v => self.includedDeletedBackTo(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala(value: Option[Int]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v => self.maxRecords(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeEnvironmentsRequestOps(val self: DescribeEnvironmentsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdsAsScala: Option[Seq[String]] =
    Option(self.environmentIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNamesAsScala: Option[Seq[String]] =
    Option(self.environmentNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeDeletedAsScala: Option[Boolean] = Option(self.includeDeleted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includedDeletedBackToAsScala: Option[java.time.Instant] = Option(self.includedDeletedBackTo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentsRequestOps {

  implicit def toDescribeEnvironmentsRequestBuilderOps(
      v: DescribeEnvironmentsRequest.Builder
  ): DescribeEnvironmentsRequestBuilderOps = new DescribeEnvironmentsRequestBuilderOps(v)

  implicit def toDescribeEnvironmentsRequestOps(v: DescribeEnvironmentsRequest): DescribeEnvironmentsRequestOps =
    new DescribeEnvironmentsRequestOps(v)

}
