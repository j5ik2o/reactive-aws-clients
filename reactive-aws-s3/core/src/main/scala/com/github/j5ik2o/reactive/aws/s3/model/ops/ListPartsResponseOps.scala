// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListPartsResponseBuilderOps(val self: ListPartsResponse.Builder) extends AnyVal {

  final def abortDateAsScala(value: Option[java.time.Instant]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortDate(v)
    }
  }

  final def abortRuleIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortRuleId(v)
    }
  }

  final def bucketAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def uploadIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def partNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.partNumberMarker(v)
    }
  }

  final def nextPartNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.nextPartNumberMarker(v)
    }
  }

  final def maxPartsAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.maxParts(v)
    }
  }

  final def isTruncatedAsScala(value: Option[Boolean]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  final def partsAsScala(value: Option[Seq[Part]]): ListPartsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parts(v.asJava)
    }
  }

  final def initiatorAsScala(value: Option[Initiator]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.initiator(v)
    }
  }

  final def ownerAsScala(value: Option[Owner]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

  final def storageClassAsScala(value: Option[StorageClass]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class ListPartsResponseOps(val self: ListPartsResponse) extends AnyVal {

  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate)

  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  final def partNumberMarkerAsScala: Option[Int] = Option(self.partNumberMarker)

  final def nextPartNumberMarkerAsScala: Option[Int] = Option(self.nextPartNumberMarker)

  final def maxPartsAsScala: Option[Int] = Option(self.maxParts)

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  final def partsAsScala: Option[Seq[Part]] = Option(self.parts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def initiatorAsScala: Option[Initiator] = Option(self.initiator)

  final def ownerAsScala: Option[Owner] = Option(self.owner)

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPartsResponseOps {

  implicit def toListPartsResponseBuilderOps(v: ListPartsResponse.Builder): ListPartsResponseBuilderOps =
    new ListPartsResponseBuilderOps(v)

  implicit def toListPartsResponseOps(v: ListPartsResponse): ListPartsResponseOps = new ListPartsResponseOps(v)

}
