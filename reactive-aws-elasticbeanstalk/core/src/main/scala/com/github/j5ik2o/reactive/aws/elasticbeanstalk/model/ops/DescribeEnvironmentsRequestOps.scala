// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentsRequestBuilderOps(val self: DescribeEnvironmentsRequest.Builder) extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def environmentIdsAsScala(value: Option[Seq[String]]): DescribeEnvironmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environmentIds(v.asJava)
    }
  }

  final def environmentNamesAsScala(value: Option[Seq[String]]): DescribeEnvironmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environmentNames(v.asJava)
    }
  }

  final def includeDeletedAsScala(value: Option[Boolean]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.includeDeleted(v)
    }
  }

  final def includedDeletedBackToAsScala(value: Option[java.time.Instant]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.includedDeletedBackTo(v)
    }
  }

  final def maxRecordsAsScala(value: Option[Int]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeEnvironmentsRequestOps(val self: DescribeEnvironmentsRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def environmentIdsAsScala: Option[Seq[String]] = Option(self.environmentIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def environmentNamesAsScala: Option[Seq[String]] = Option(self.environmentNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def includeDeletedAsScala: Option[Boolean] = Option(self.includeDeleted)

  final def includedDeletedBackToAsScala: Option[java.time.Instant] = Option(self.includedDeletedBackTo)

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

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
