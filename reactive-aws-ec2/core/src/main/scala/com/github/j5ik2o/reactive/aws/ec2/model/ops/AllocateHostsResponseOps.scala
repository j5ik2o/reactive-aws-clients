// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateHostsResponseBuilderOps(val self: AllocateHostsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hostIdsAsScala(value: Option[Seq[String]]): AllocateHostsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIds(v.asJava) } 
            }


}

final class AllocateHostsResponseOps(val self: AllocateHostsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def hostIdsAsScala: Option[Seq[String]] = Option(self.hostIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateHostsResponseOps {

implicit def toAllocateHostsResponseBuilderOps(v: AllocateHostsResponse.Builder): AllocateHostsResponseBuilderOps = new AllocateHostsResponseBuilderOps(v)

implicit def toAllocateHostsResponseOps(v: AllocateHostsResponse): AllocateHostsResponseOps = new AllocateHostsResponseOps(v)

}

