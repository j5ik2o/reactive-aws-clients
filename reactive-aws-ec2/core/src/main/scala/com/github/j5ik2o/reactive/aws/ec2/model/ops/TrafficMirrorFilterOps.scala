// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TrafficMirrorFilterBuilderOps(val self: TrafficMirrorFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): TrafficMirrorFilter.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorFilterId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingressFilterRulesAsScala(value: Option[Seq[TrafficMirrorFilterRule]]): TrafficMirrorFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ingressFilterRules(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressFilterRulesAsScala(value: Option[Seq[TrafficMirrorFilterRule]]): TrafficMirrorFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.egressFilterRules(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkServicesAsScala(value: Option[Seq[TrafficMirrorNetworkService]]): TrafficMirrorFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkServices(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TrafficMirrorFilter.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TrafficMirrorFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TrafficMirrorFilterOps(val self: TrafficMirrorFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingressFilterRulesAsScala: Option[Seq[TrafficMirrorFilterRule]] = Option(self.ingressFilterRules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressFilterRulesAsScala: Option[Seq[TrafficMirrorFilterRule]] = Option(self.egressFilterRules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkServicesAsScala: Option[Seq[TrafficMirrorNetworkService]] = Option(self.networkServices).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrafficMirrorFilterOps {

  implicit def toTrafficMirrorFilterBuilderOps(v: TrafficMirrorFilter.Builder): TrafficMirrorFilterBuilderOps =
    new TrafficMirrorFilterBuilderOps(v)

  implicit def toTrafficMirrorFilterOps(v: TrafficMirrorFilter): TrafficMirrorFilterOps = new TrafficMirrorFilterOps(v)

}
