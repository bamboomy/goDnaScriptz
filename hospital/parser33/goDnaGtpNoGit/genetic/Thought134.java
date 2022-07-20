package genetic;
import java.util.ArrayList;
class Thought134 extends Thought{
private static ArrayList<Thought134> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 191.08283891152902;
private double fd1 = 708.3475832108553;
private Thought fo0 = null;
private Thought fo1 = null;
Thought134 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought134 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought134 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought134 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought134 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought134 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought134 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought134 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought134 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought134 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought134 instance = new Thought134 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought323.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[7][6] += fd0;
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought188.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    ab2 = !ab3;
    boolean lb2 = true;
    Output.points[7][7] -= fd0;
    Thought lo3 = Thought293.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, ab1, ab2);
}
    Output.points[7][8] -= fd0;
    fd1 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb2 = lb4 || lb5;
if(fo0 != null){
      lb6 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[8][0] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo0.m3();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought351.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought95.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad1 < ad2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ad3 = fo0.m3(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[8][1] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = ad1 < ad2;
    ad3 *= -1;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][2] -= fd1;
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 402.553930356018;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought347.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb2);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 629.1438929561401;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo1 = Thought179.getInstance();
    Thought lo2 = Thought162.getInstance(fb1, fb0, fb1, fb0);
    ld0 = fd0 + fd1;
    double ld3 = 641.2988130214785;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(ld0, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = ld0 < ld3;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld3, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ld3, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    fb1 = fb0 && fb1;
    ld0 *= -1;
    fb0 = ld3 < fd0;
    boolean lb4 = false;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        double ld2 = 206.47448682032746;
        lb1 = fb0 || fb1;
        boolean lb3 = true;
        boolean lb4 = true;
if(ao1 != null){
          ad4 = ao1.m3(lb3, lb4, lb0, lb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, fb0, fb1, lb3, lb4);
}
        if (lb0) {
            } else if (lb1) {
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab1 = ao4.m2();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = !ab2;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    if (fb0) {
        boolean lb1 = false;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 && lb1;
        lb0 = ab1 || ab2;
        ab3 = ab4 || fb0;
        double ld2 = 760.385649366797;
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb1, lb0, ab1);
}
        Output.points[8][3] -= ld2;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
    double ld0 = 703.133569728144;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
        double ld1 = 737.433366671216;
        fd0 *= -1;
        double ld2 = 768.7674930754722;
        fd0 *= -1;
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 && fb0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld0);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo1 != null){
              fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
            fd0 *= -1;
            Thought lo3 = Thought193.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld2, ld0, fb1, fb0, fb1, fb0);
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    if (ab3) {
        ab4 = fd0 > fd1;
        boolean lb0 = false;
        double ld1 = 988.6665854392949;
        ld1 = fd0 + fd1;
        Output.points[8][4] += ld1;
        boolean lb2 = true;
        if (ab3) {
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 520.9446535194573;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought148.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        Output.points[8][5] -= fd0;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m3(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
        Output.points[8][6] -= ad3;
        if (fb0) {
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
            ad2 = ad3 - ad4;
            fb0 = !fb1;
            Thought lo2 = Thought349.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  fo1 = fo0.m4();
}
}}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought288.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld1 = 948.3877570399736;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb2 = ab1 && ab2;
    boolean lb3 = false;
    ab2 = ad4 > fd0;
    fd1 = ld1 - ad1;
if(fo0 != null){
      ab3 = fo0.m2(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought376.getInstance(fb0, fb1, lb0, fb0);
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        double ld0 = 909.7978411627109;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = ad1 > ad2;
        fb1 = fb0 && fb1;
        boolean lb1 = true;
        ad3 = ad4 - fd0;
        boolean lb2 = false;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, lb1, lb2, fb0, fb1);
}
        lb1 = fd1 < ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        lb2 = fb0 || fb1;
        lb1 = lb2 || fb0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 258.32480783647355;
    ab3 = fd0 < fd1;
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld0 = fd0 - fd1;
    if (fb1) {
        if (ab1) {
            ab2 = ab3 && ab4;
}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    boolean lb0 = false;
    double ld1 = 366.7100394612913;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
    ad1 = ad2 - ad3;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    Output.points[8][7] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(ab1, ab2, ab3, ab4);
}
    double ld2 = 512.7766315863412;
    fb0 = fd0 > fd1;
    fb1 = lb0 || ab1;
    Thought lo3 = Thought277.getInstance(fo0, fo1, ao1, ao2, ld1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    ab1 = ad3 > ad4;
    ab2 = fd0 < fd1;
    Thought lo4 = Thought2.getInstance(ld1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 938.8632043233758;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    lb1 = fd0 > fd1;
    Output.points[8][8] += ld0;
    double ld2 = 367.73638087005565;
if(fo0 != null){
      fo0.m2();
}
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    ld2 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      lb1 = fo1.m2(lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb1, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, fb1, lb1, lb3, lb4);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = lb0 && lb1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    ab2 = !ab3;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    double ld4 = 694.049463091235;
    fd0 *= -1;
    Thought lo5 = Thought368.getInstance(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1, lb2, lb3, ab1, ab2);
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ld4, fd0, fd1, ld4, lb0, lb1, lb2, lb3);
}
    fd0 *= -1;
    ab1 = ab2 || ab3;
    fd1 = ld4 - fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
          fo0.m1();
}
    fb1 = !fb0;
    boolean lb0 = true;
    Thought lo1 = Thought157.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb2);
}
    double ld3 = 79.74318509818477;
    if (fb0) {
        Output.points[0][0] -= ad2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld3);
}
        ad1 = ad2 + ad3;
        boolean lb4 = false;
        ad4 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1);
}
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = fd0 > fd1;
    Thought lo0 = Thought96.getInstance();
    Thought lo1 = Thought304.getInstance(ab2, ab3, ab4, fb0);
    Thought lo2 = Thought62.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    ab1 = !ab2;
    boolean lb4 = true;
    double ld5 = 452.731897379231;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][1] -= fd0;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    Thought lo0 = Thought358.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought31.getInstance(fo0, fo1, ao1, ao2);
    lb1 = lb2 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    lb1 = !lb2;
if(ao4 != null){
      fd0 = ao4.m3();
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[0][2] -= fd1;
    Output.points[0][3] -= ad1;
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[0][4] += ad4;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    Output.points[0][5] -= fd1;
    boolean lb2 = true;
    ad1 = ad2 + ad3;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
if(ao1 != null){
      lb3 = ao1.m2();
}
    ad1 *= -1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 960.9634816721845;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao2.m1();
}
    lb1 = lb2 && ab1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought201.getInstance(ab2, ab3, ab4, fb0);
    Thought lo1 = Thought185.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        ab4 = ad2 > ad3;
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          ad2 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3);
}
        Thought lo2 = Thought239.getInstance(ad3, ad4, fd0, fd1);
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ab1 = ao3.m2();
}
        ab2 = fd1 < ad1;
        }
if(ao4 != null){
      ao4.m2(ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][6] -= fd0;
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = lb1 || fb0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !fb0;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1(fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - ad1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 - fd1;
    Thought lo0 = Thought331.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Output.points[0][8] += fd0;
    fb1 = fd1 < fd0;
    Output.points[1][0] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    Output.points[1][1] += fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    boolean lb0 = true;
    double ld1 = 538.8363158279772;
    lb0 = ld1 < fd0;
    boolean lb2 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
    double ld3 = 574.5340218343046;
    boolean lb4 = false;
    lb2 = ld1 > ld3;
if(ao3 != null){
      ao3.m3();
}
if(ao4 != null){
      lb4 = ao4.m2(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, ld3, fd0, lb4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, ld3, fd0, lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb0, lb2, lb4, fb0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 820.6466256345818;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    Output.points[1][2] -= fd0;
    Output.points[1][3] += fd1;
    ld0 *= -1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ad1, lb2, fb0, fb1, lb1);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb2 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, ld0, ad1);
}
    Output.points[1][4] += ad2;
    if (lb1) {
        lb2 = !fb0;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][5] -= fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought27.getInstance();
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    double ld1 = 60.94839019119235;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Output.points[1][6] -= ad1;
    ab3 = ab4 || fb0;
    Output.points[1][7] += ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    double ld2 = 916.9981535967847;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld2);
}
    lb1 = ad1 < ad2;
    double ld3 = 733.6667794303767;
    ad2 *= -1;
    ad3 *= -1;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
}
    double ld4 = 874.4397249743582;
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    Output.points[1][8] += fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought112.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld1 = 874.5630644486978;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    Output.points[2][0] -= fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
        double ld2 = 284.4157196382321;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb1, fb0, fb1, fb0);
}
    double ld3 = 311.0874341949209;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 348.8187797311078;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
    Output.points[2][1] -= fd0;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb1 = fd1 < ld0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][2] -= fd1;
    boolean lb0 = false;
        fb0 = fb1 || lb0;
    double ld1 = 395.2970203508485;
    double ld2 = 464.33027130112333;
    Thought lo3 = Thought343.getInstance(fb0, fb1, lb0, fb0);
    ld1 = ld2 - fd0;
    Output.points[2][3] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(ld1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ld1 < ld2;
    double ld4 = 604.1731887780988;
    lb0 = fb0 || fb1;
    ld4 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
