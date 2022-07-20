package genetic;
import java.util.ArrayList;
class Thought55 extends Thought{
private static ArrayList<Thought55> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 806.6376539290067;
private double fd1 = 85.79154868451816;
private Thought fo0 = null;
private Thought fo1 = null;
Thought55 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought55 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought55 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld1 = 285.3547470420175;
    Thought lo2 = Thought69.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 151.79863620919573;
        ld1 *= -1;
        fd0 = fd1 - ld3;
        boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld3);
}
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld3, ld1, fd0, fd1);
}
        fb0 = fb1 || lb4;
        lb0 = fb0 || fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought375.getInstance();
    Thought lo1 = Thought132.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    Output.points[3][8] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    Output.points[4][0] -= ad2;
    if (fb0) {
        ad3 *= -1;
        fb1 = ad4 < fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ad1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    double ld0 = 578.9721108522526;
    ab3 = !ab4;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[4][1] += ad1;
    fb1 = ab1 || ab2;
    ab3 = ad2 > ad3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        boolean lb3 = true;
        ab2 = ab3 && ab4;
        double ld4 = 551.1419567652752;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought132.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    double ld1 = 942.9086924059487;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    double ld2 = 940.1253834421778;
    boolean lb3 = false;
    fd0 *= -1;
    Output.points[4][2] += fd1;
    fb0 = fb1 || lb3;

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
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    Thought lo1 = Thought20.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    double ld2 = 648.6561060157823;
    fb1 = !lb0;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld2, ad1, ad2, ad3);
}
    boolean lb3 = true;
        lb0 = lb3 && fb0;
    fb1 = lb0 && lb3;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Thought lo0 = Thought364.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fd1 < fd0;
    fb1 = !ab1;
    double ld1 = 176.08592548986005;

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
    ab2 = ad2 > ad3;
        ad4 = fd0 + fd1;
    Output.points[4][3] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought297.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ad3 *= -1;
    Thought lo1 = Thought350.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = !fb0;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
        Thought lo1 = Thought102.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    double ld2 = 279.39698543087314;
    Output.points[4][4] -= fd0;
    fb1 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld2, fd0);
}
    Output.points[4][5] += fd1;
    ld2 *= -1;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = ld2 < fd0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought191.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought380.getInstance(fd1, fd0, fd1, fd0);
    Output.points[4][6] += fd1;
    double ld2 = 724.9972338264769;
    Thought lo3 = Thought376.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    fd1 *= -1;
    ld2 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld2;
    boolean lb4 = true;
    ab2 = fd0 < fd1;
    double ld5 = 284.9790035191247;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb4;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ad1;
        boolean lb0 = false;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought232.getInstance(ad3, ad4, fd0, fd1);
        ad1 = ad2 + ad3;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        boolean lb3 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1();
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    double ld1 = 373.623048168689;
    if (ab4) {
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
        } else if (fb0) {
        double ld2 = 275.20623441144323;
        Thought lo3 = Thought130.getInstance();
        ld1 = ad1 - ad2;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ld2 = fo1.m3(ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
        double ld4 = 22.440123508343305;
        double ld5 = 960.1606750467504;
        ab4 = ad2 < ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
        Thought lo6 = Thought308.getInstance(fo1, fo0, fo1, fo0);
        ab2 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return ab3;
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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought263.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld1 = 457.3496137691626;
    fb0 = fd0 < fd1;
    boolean lb2 = true;
    Thought lo3 = Thought256.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
    fb0 = fb1 || lb2;
        fb0 = fb1 || lb2;
    fd0 = fd1 - ld1;
    double ld4 = 587.4563219308309;
    fb0 = !fb1;
    lb2 = ld4 < fd0;
    Output.points[4][7] += fd1;
    ld1 *= -1;
    fb0 = !fb1;
    ld4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}

Thought.STACK_COUNTER++;
return lb2;
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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
    Output.points[4][8] += ad3;
    Thought lo0 = Thought330.getInstance(fb0, fb1, fb0, fb1);
    Output.points[5][0] -= ad4;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        boolean lb2 = true;
        boolean lb3 = true;
        boolean lb4 = false;
if(ao1 != null){
          ad3 = ao1.m3();
}
        boolean lb5 = true;
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
    ab3 = fd1 < fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[5][1] -= fd0;
    lb0 = lb1 || ab1;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return lb0;
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
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ab2 = !ab3;
    Thought lo0 = Thought266.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    if (ab2) {
        ab3 = !ab4;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, ad1, ad2);
}
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
            Output.points[5][2] += ad1;
if(ao1 != null){
              fo1 = ao1.m4();
}
            fb1 = ad2 < ad3;
            ab1 = ab2 && ab3;
}}
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
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought297.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[5][3] -= fd0;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought229.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[5][4] -= fd1;
    fb0 = fb1 || fb0;
    double ld2 = 264.86811631943647;
if(fo0 != null){
      fb1 = fo0.m2();
}

Thought.STACK_COUNTER++;
return ld2;
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
if(fo1 != null){
      fd1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    ab3 = fd1 > fd0;
    Thought lo2 = Thought320.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab4 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb3 = true;

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
    ad1 *= -1;
    ad2 *= -1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    double ld0 = 754.1214291199299;
    fb1 = ad2 > ad3;
    fb0 = fb1 || fb0;
    Output.points[5][5] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Thought lo2 = Thought268.getInstance(fd0, fd1, ld0, ad1);
    Thought lo3 = Thought229.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fb0 = fb1 || lb1;
    Output.points[5][6] -= fd1;
    Thought lo4 = Thought209.getInstance();
    double ld5 = 948.0196174283145;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = ld0 < ld5;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    double ld6 = 966.0917359846699;
    boolean lb7 = true;
    lb7 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld5, ld6, fb0, fb1, lb1, lb7);
}

Thought.STACK_COUNTER++;
return ad1;
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    double ld0 = 410.7301230736978;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ab1 = ad4 < fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    double ld0 = 219.44466920300425;
    ld0 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 718.1809919483379;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ld0, ld1, fd0, fd1);
}
        Output.points[5][7] += ld0;
        ld1 = fd0 + fd1;
        ld0 = ld1 + fd0;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, ld1, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        ld0 = ld1 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 = ld1 + fd0;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        double ld3 = 202.9227210289579;
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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld1 = 346.1226489520134;
if(ao1 != null){
      ao1.m2(ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    if (fb1) {
        ld1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        lb0 = !fb0;
if(ao2 != null){
          ao2.m2();
}
if(ao3 != null){
          fd0 = ao3.m3(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao3.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        ld1 *= -1;
        boolean lb2 = false;
        lb0 = ad1 > ad2;
        fb0 = ad3 < ad4;
        Thought lo3 = Thought388.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ad1);
}
        double ld4 = 953.9100264295045;
        fb1 = ad1 > ad2;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return ld1;
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
    ab1 = !ab2;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    Output.points[5][8] -= fd0;
    fb0 = fb1 && ab1;
    Output.points[6][0] += fd1;
    Thought lo0 = Thought13.getInstance(fo0, fo1, ao1, ao2);
        Output.points[6][1] += fd0;
    ab2 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought67.getInstance();
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    boolean lb0 = true;
    Output.points[6][2] -= ad3;
    Thought lo1 = Thought126.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    lb0 = lb2 || ab1;
    fd1 = ad1 + ad2;
    ab2 = !ab3;
    Thought lo3 = Thought60.getInstance();
    ab4 = ad3 > ad4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Output.points[6][3] += fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    double ld0 = 704.5609385514678;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought267.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        ab3 = !ab4;
        fb0 = fd0 < fd1;
        fb1 = ab1 && ab2;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          ab3 = fo1.m2();
}
        Output.points[6][4] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
            Output.points[6][5] += fd1;
            ab3 = ab4 || fb0;
            }
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        double ld0 = 185.4506702934567;
        ld0 = fd0 - fd1;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ab3 = ld0 > fd0;
        ab4 = fd1 > ld0;
        fb0 = fb1 || ab1;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fd0 *= -1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    ab2 = ab3 || ab4;
    fd1 = ad1 + ad2;
    ad3 *= -1;
        fb0 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought268.getInstance();
    fb0 = fd1 < fd0;
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    boolean lb2 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought190.getInstance(lb2, fb0, fb1, lb1);
    lb2 = fb0 || fb1;
    boolean lb4 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb1, lb2, lb4, fb0);
}
    Output.points[6][6] += fd1;
    fd0 = fd1 - fd0;
    Output.points[6][7] += fd1;
    Output.points[6][8] -= fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    lb1 = lb2 && lb4;
    fb0 = fd0 < fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 744.9028403756664;
    Output.points[7][0] -= ad4;
    boolean lb1 = true;
    Thought lo2 = Thought80.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    lb1 = fd1 > ld0;
    ad1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought255.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2, lb3, fb0, fb1, lb1);
}
    lb3 = fb0 || fb1;
    ad3 = ad4 - fd0;

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
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab4 = ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = !ab1;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    double ld0 = 577.9883865290942;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ld0 = fd0 + fd1;
    ab4 = ld0 < fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && ab1;
    boolean lb0 = false;
    Output.points[7][1] += ad1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    Output.points[7][2] += fd0;
    lb1 = fd1 > ad1;

Thought.STACK_COUNTER++;
return ao1;
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
    Thought lo0 = Thought367.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought234.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;
    lb2 = lb3 && lb4;
    double ld5 = 196.9770995664287;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5, lb4, fb0, fb1, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(fd0, fd1, ld5, fd0, lb4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
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
    Output.points[7][3] += fd0;
    Output.points[7][4] += fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[7][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 196.6619879151747;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
    ld0 = fd0 + fd1;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought227.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
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
}
