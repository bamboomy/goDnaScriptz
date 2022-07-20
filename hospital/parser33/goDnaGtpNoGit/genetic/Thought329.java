package genetic;
import java.util.ArrayList;
class Thought329 extends Thought{
private static ArrayList<Thought329> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 217.43391359247346;
private double fd1 = 550.9811264731551;
private Thought fo0 = null;
private Thought fo1 = null;
Thought329 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought329 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought329 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought329 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought329 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought329 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought329 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought329 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought329 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought329 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought329 instance = new Thought329 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought250.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 60.830830195412695;
    Thought lo1 = Thought205.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    double ld2 = 198.50360108247867;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld0, ld2);
}
    fd0 *= -1;
    double ld4 = 739.9253337790817;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
    Output.points[8][0] -= ld4;
    Thought lo5 = Thought214.getInstance();
    fd0 = fd1 - ld0;
    Output.points[8][1] -= ld2;
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb3 = ld0 > ld2;

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
    fb1 = !fb0;
    ad1 = ad2 + ad3;
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = fd1 < ad1;
        Output.points[8][2] += ad2;
        fb0 = ad3 < ad4;
        Output.points[8][3] += fd0;
        Output.points[8][4] -= fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought253.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        double ld1 = 863.0939252861549;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld1 = ad1 + ad2;
        Output.points[8][5] -= ad3;
        Thought lo2 = Thought173.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
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
    ab2 = ab3 && ab4;
    Thought lo0 = Thought197.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fb0 = fd1 > ad1;
    for(int i0=0; i0<10; i0++){
        fb1 = !ab1;
if(fo0 != null){
          fo0.m2();
}
        ab2 = ad2 > ad3;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
    boolean lb1 = true;
        ad3 *= -1;
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    ab3 = ad4 < fd0;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    double ld2 = 411.97707449923485;
    Thought lo3 = Thought346.getInstance();
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 613.466662819048;
if(ao2 != null){
      lb0 = ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    double ld2 = 649.5954236468602;
    Output.points[8][6] += ad4;
    fb1 = fd0 < fd1;
    lb0 = ld1 > ld2;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld1);
}
    if (fb1) {
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
        ad4 *= -1;
if(ao4 != null){
          fd0 = ao4.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ld2, ad1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought308.getInstance(fd1, fd0, fd1, fd0);
    lb0 = ab1 || ab2;
    Thought lo2 = Thought117.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo3 = Thought342.getInstance(fb1, lb0, ab1, ab2);
    Output.points[8][7] -= fd0;
    ab3 = !ab4;
    double ld4 = 62.16682233761114;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld4, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb5 = true;
    boolean lb6 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb5 = ld4 > fd0;

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
    Output.points[8][8] += ad1;
    Thought lo0 = Thought55.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ab1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    if (ab2) {
        ab3 = fd1 < ad1;
        ab4 = !fb0;
        boolean lb1 = false;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
        double ld2 = 748.8750420968299;
        fb0 = fb1 || lb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad2 *= -1;
        ab1 = ad3 < ad4;
        Thought lo3 = Thought361.getInstance(ab2, ab3, ab4, fb0);
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1, lb1, ab1, ab2, ab3);
}
        ab4 = ad2 > ad3;
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ld2, fb0, fb1, lb1, ab1);
}
        ad1 *= -1;
        Output.points[0][0] -= ad2;
        boolean lb4 = false;
        ad3 *= -1;
        ab1 = ab2 || ab3;
        ad4 = fd0 - fd1;
if(ao1 != null){
          ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb4);
}
        ld2 = ad1 - ad2;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        Thought lo5 = Thought7.getInstance(fo1, ao1, ao2, ao3);
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
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    Output.points[0][1] -= fd1;
    fb0 = !fb1;
    double ld1 = 117.32455919191155;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    ld1 = fd0 + fd1;
    if (fb0) {
        Thought lo2 = Thought296.getInstance(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
        Output.points[0][2] += fd0;
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    Output.points[0][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    ab1 = fd1 < fd0;
    boolean lb0 = true;
    Output.points[0][4] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    fd0 *= -1;
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought229.getInstance(ab3, ab4, fb0, fb1);
    Thought lo2 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
    Thought lo3 = Thought320.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        } else if (fb1) {
        boolean lb4 = false;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought238.getInstance();
    ad1 = ad2 - ad3;
    double ld1 = 5.64418703892776;
    fb1 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld1;
    Thought lo2 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Output.points[0][5] -= fd0;
    double ld3 = 790.6665895939304;
    fb1 = fd0 > fd1;
    ld1 *= -1;
    fb0 = ld3 > ad1;
    fb1 = fb0 || fb1;
    Output.points[0][6] += ad2;
    boolean lb4 = false;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1, lb4, fb0, fb1, lb4);
}
    fb0 = fb1 && lb4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
    ld3 = ad1 + ad2;
    fb1 = ad3 > ad4;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
        Thought lo0 = Thought233.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld1 = 594.6772767240022;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fd1 = ld1 - ad1;
    fb0 = ad2 > ad3;
    boolean lb2 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
return ab1;
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[0][7] -= fd1;
    fd0 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m2();
}
    Output.points[0][8] += fd1;
    double ld0 = 481.5150999689188;

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
    ad1 = ad2 + ad3;
    Output.points[1][0] += ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        ad3 = ad4 - fd0;
        fd1 = ad1 - ad2;
        ad3 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
        fb0 = ad2 > ad3;
        Output.points[1][1] -= ad4;
        fd0 *= -1;
        boolean lb0 = true;
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
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
    Thought lo0 = Thought40.getInstance();
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    Thought lo1 = Thought133.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    double ld2 = 255.75218964284363;
    Thought lo3 = Thought184.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
    fd1 = ld2 + fd0;
if(ao3 != null){
      ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo4 = Thought243.getInstance(ld2, fd0, fd1, ld2, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    Thought lo5 = Thought36.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    Thought lo6 = Thought360.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ab1 = ao1.m2(ld2, fd0, fd1, ld2);
}
    Output.points[1][2] += fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ab2;
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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ab3 = ad1 < ad2;
    boolean lb1 = true;
    Thought lo2 = Thought26.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    lb1 = ab1 && ab2;
    ad1 = ad2 + ad3;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
        fd0 *= -1;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[1][3] += fd1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought75.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb1 = true;
    Thought lo2 = Thought336.getInstance();

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    Thought lo0 = Thought378.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought345.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    lb3 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought34.getInstance();
    double ld1 = 391.40034736261964;
    fb0 = ld1 < ad1;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
    if (fb0) {
        boolean lb3 = false;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb0, fb1, lb3, lb2);
}
        ad4 = fd0 + fd1;
        boolean lb4 = true;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb3);
}
            Output.points[1][4] -= ld1;
if(fo0 != null){
              lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}
            ad1 *= -1;
            ad2 = ad3 + ad4;
if(fo1 != null){
              fo1.m1(fd0, fd1, ld1, ad1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            lb2 = fb0 && fb1;
if(fo1 != null){
              fo0 = fo1.m4();
}
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    Thought lo1 = Thought374.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
    ab2 = !ab3;
        ad4 = fd0 - fd1;
    ab4 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    fb0 = ad4 > fd0;
    boolean lb3 = false;
    fb0 = !fb1;
    boolean lb4 = true;
    lb0 = !lb2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld5 = 208.30553932815405;
        lb3 = lb4 && ab1;
        Thought lo6 = Thought164.getInstance();
}
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
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 968.3917017244386;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
        fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
    fb0 = !fb1;
    Output.points[1][5] += fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd1 = ld0 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
    double ld1 = 302.26754173076114;
    ld0 = ld1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo0 = Thought305.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
if(ao3 != null){
      fb1 = ao3.m2();
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    double ld0 = 804.164618360933;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    double ld1 = 566.1510373470824;
    double ld2 = 195.37625129181174;
        ld2 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ld2, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ld1 < ld2;
    fd0 *= -1;
    boolean lb3 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(fd1, ld0, ld1, ld2);
}
    fb0 = fb1 && lb3;
    ab1 = !ab2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought76.getInstance();
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    double ld1 = 709.9078161380654;
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;
    ad3 *= -1;
    fb0 = fb1 || ab1;
    double ld2 = 868.4839381827643;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld3 = 237.20528984288853;
    ld1 = ld2 + ld3;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought221.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
    ab2 = fd1 < ld1;
    Thought lo5 = Thought262.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ab3 = ao4.m2(ld2, ld3, ad1, ad2);
}
    ab4 = ad3 < ad4;
    fd0 = fd1 - ld1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m1();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld2, ld3, ad1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 662.8705396880099;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    lb0 = fd0 < fd1;
    lb2 = ld1 < fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb2 = fo0.m2();
}
    fd1 *= -1;
    Thought lo3 = Thought207.getInstance(fb0, fb1, lb0, lb2);
    fb0 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
        fd0 = fd1 + ld1;
    double ld4 = 395.0175085794092;
    fb1 = ld4 > fd0;
    lb0 = lb2 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    Output.points[1][6] += fd1;

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
    ab2 = !ab3;
    Thought lo0 = Thought296.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought23.getInstance(ab3, ab4, fb0, fb1);
    fd1 *= -1;
    Thought lo3 = Thought268.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb5, lb6, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2);
}
        double ld0 = 215.5579137257259;
        ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        ld0 = ad1 + ad2;
        fb0 = ad3 > ad4;
        fb1 = !fb0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    Output.points[1][7] -= fd0;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 934.9817209271164;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought215.getInstance();
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    double ld0 = 414.79567467437226;
    Thought lo1 = Thought222.getInstance();
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        fb1 = fd0 > fd1;
        fb0 = ld0 > fd0;
        boolean lb2 = true;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 && fb0;
        double ld3 = 453.5828076486172;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    ad3 *= -1;
    ad4 *= -1;
    Thought lo0 = Thought52.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought206.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought29.getInstance(fo0, fo1, ao1, ao2);
    boolean lb3 = false;
    boolean lb4 = false;
    fd0 *= -1;
if(ao3 != null){
      lb3 = ao3.m2(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb3);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb4, fb0, fb1, lb3);
}
if(ao1 != null){
          ad4 = ao1.m3(fd0, fd1, ad1, ad2, lb4, fb0, fb1, lb3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb4, fb0, fb1, lb3);
}
    ad3 = ad4 + fd0;
    lb4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought358.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
        Thought lo0 = Thought213.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[1][8] -= fd1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[2][0] += fd1;
    ad1 = ad2 - ad3;
    ab4 = !fb0;
    Output.points[2][1] -= ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    double ld1 = 825.6311301418726;
    fb0 = !fb1;
    fd0 = fd1 + ld1;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ao3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought124.getInstance();
    Output.points[2][2] += fd0;
    fb1 = !fb0;
    double ld1 = 428.6587775370774;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    double ld3 = 651.0625237678474;
if(fo1 != null){
      fo1.m1(ld3, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought185.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][3] += fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    double ld2 = 619.0607099941185;
    ld2 *= -1;
    Output.points[2][4] += fd0;

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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
    lb1 = fd1 < fd0;
    double ld5 = 934.5296785249449;
    boolean lb6 = false;
    Thought lo7 = Thought201.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ld5;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld5, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld5, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m3(lb2, lb3, lb4, lb6);
}
    fb0 = ld5 < fd0;
    double ld8 = 386.04240789722485;
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
}
