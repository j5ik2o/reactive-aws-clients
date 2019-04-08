// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class S3KeyFilterBuilderOps(val self: S3KeyFilter.Builder) extends AnyVal {

  final def filterRulesAsScala(value: Option[Seq[FilterRule]]): S3KeyFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filterRules(v.asJava)
    } // Seq[FilterRule]
  }

}

final class S3KeyFilterOps(val self: S3KeyFilter) extends AnyVal {

  final def filterRulesAsScala: Option[Seq[FilterRule]] = Option(self.filterRules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[FilterRule]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToS3KeyFilterOps {

  implicit def toS3KeyFilterBuilderOps(v: S3KeyFilter.Builder): S3KeyFilterBuilderOps = new S3KeyFilterBuilderOps(v)

  implicit def toS3KeyFilterOps(v: S3KeyFilter): S3KeyFilterOps = new S3KeyFilterOps(v)

}
