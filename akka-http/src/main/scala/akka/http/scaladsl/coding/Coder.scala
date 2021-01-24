/*
 * Copyright (C) 2009-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.scaladsl.coding

/** Marker trait for A combined Encoder and Decoder */
trait Coder extends Encoder with Decoder
